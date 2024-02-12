package com.br.tccandroid;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognizer;
import com.google.mlkit.vision.text.TextRecognition;
import com.google.mlkit.vision.text.latin.TextRecognizerOptions;



public class telaOCR extends AppCompatActivity {

    private MaterialButton inputImageBtn;
    private MaterialButton recognizedTextBtn;
    private ShapeableImageView imageIv;
    private EditText recognizedTextEt;

    private static final String TAG = "MAIN_TAG";

    private Uri imageUri = null;

    private static final int CAMERA_REQUEST_CODE = 100;
    private static final int STORAGE_REQUEST_CODE = 101;

    private String[] cameraPermissions;
    private String[] storagePermissions;

    private ProgressDialog progressDialog;

    private TextRecognizer textRecognizer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_ocr);

        MaterialButton btnConfirmarPlaca = findViewById(R.id.btnConfirmarPlaca);
        EditText editText = findViewById(R.id.recognizedTextEt);

        btnConfirmarPlaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pega o conteúdo do EditText
                String conteudoEditText = editText.getText().toString();
                // Cria uma intenção (intent) para iniciar a SegundaTelaActivity
                Intent intent = new Intent(telaOCR.this, telaOcrKm.class);

                // Passa o conteúdo para a próxima atividade usando o Bundle
                intent.putExtra("CONTEUDO_EDIT_TEXT", conteudoEditText);

                // Inicia a nova atividade
                startActivity(intent);
            }
        });

        inputImageBtn = findViewById(R.id.inputImageBtn);
        recognizedTextBtn = findViewById(R.id.recognizedTextBtn);
        imageIv = findViewById(R.id.imageIv);
        recognizedTextEt = findViewById(R.id.recognizedTextEt);

        cameraPermissions = new String[]{Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE};
        storagePermissions = new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE};

        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Espere Por Favor");
        progressDialog.setCanceledOnTouchOutside(false);

        textRecognizer = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS);


        inputImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInputImageDialog();
            }
        });

        recognizedTextBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (imageUri == null){

                    Toast.makeText(telaOCR.this, "Tire a foto primeiro...", Toast.LENGTH_SHORT).show();
                }
                else {

                    recognizedTextFromImage();
                }
            }
        });
    }

    private void recognizedTextFromImage() {

        Log.d(TAG, "recognizedTextFromImage: ");
        progressDialog.setMessage("Preparando imagem...");
        progressDialog.show();

        try {

            InputImage inputImage = InputImage.fromFilePath(this, imageUri);

            progressDialog.setMessage("Reconhecendo placa");

            Task<Text> textTaskResult = textRecognizer.process(inputImage)
                    .addOnSuccessListener(new OnSuccessListener<Text>() {

                        @Override
                        public void onSuccess(Text text){

                            progressDialog.dismiss();

                            String recognizedText = text.getText();
                            Log.d(TAG, "onSuccess: recognizedText: "+recognizedText);

                            recognizedTextEt.setText(recognizedText);

                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {

                        @Override
                        public void onFailure(@NonNull Exception e){
                            
                            progressDialog.dismiss();
                            Log.d(TAG, "onFailure: ", e);

                            Toast.makeText(telaOCR.this, "Falha devido a " + e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });

        } catch (Exception e) {

            progressDialog.dismiss();
            Log.e(TAG, "recognizedTextFromImage: ", e);
            Toast.makeText(this, "Falha devido a "+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void showInputImageDialog() {
        PopupMenu popupMenu = new PopupMenu(this, inputImageBtn);

        popupMenu.getMenu().add(Menu.NONE, 1, 1, "CAMERA");
        popupMenu.getMenu().add(Menu.NONE, 2, 2, "GALERIA");

        popupMenu.show();

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {

                int id = menuItem.getItemId();
                if (id == 1){

                    Log.d(TAG, "onMenuItemClick: Camera Clicked...");
                    if (checkCameraPermission()){

                        pickImageCamera();
                    }
                    else {

                        requestCameraPermission();
                    }
                }
                else if (id == 2) {

                    Log.d(TAG, "onMenuItemClick: Gallery Clicked");
                    if (checkStoragePermission()){

                        pickImageGallery();
                    }
                    else {

                        requestStoragePermission();
                    }
                }
                return true;
            }
        });
    }

    private void pickImageGallery(){

        Log.d(TAG, "pickImageGallery: ");
        Intent intent = new Intent(Intent.ACTION_PICK);

        intent.setType("image/*");
        galleryActivityResultLauncher.launch(intent);
    }

    private ActivityResultLauncher<Intent> galleryActivityResultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK){

                        Intent data = result.getData();
                        imageUri = data.getData();
                        Log.d(TAG, "onActivityResult: imageUri "+imageUri);
                        imageIv.setImageURI(imageUri);
                    }
                    else {
                        Log.d(TAG, "onActivityResult: Cancelar");
                        Toast.makeText(telaOCR.this, "Cancelar...", Toast.LENGTH_SHORT).show();
                    }
                }
            }
    );

    private void pickImageCamera(){
        Log.d(TAG, "pickImageCamera: ");
        ContentValues values = new ContentValues();
        values.put(MediaStore.Images.Media.TITLE, "Título Exemplo");
        values.put(MediaStore.Images.Media.DESCRIPTION, "Descrição Exemplo");

        imageUri = getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri);
        cameraActivityResultLaucher.launch(intent);
    }

    private ActivityResultLauncher<Intent> cameraActivityResultLaucher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK){

                        Log.d(TAG, "onActivityResult: imageUri "+imageUri);
                        imageIv.setImageURI(imageUri);
                    }
                    else {

                        Log.d(TAG, "onActivityResult: Cancelar");
                        Toast.makeText(telaOCR.this, "Cancelado", Toast.LENGTH_SHORT).show();
                    }
                }
            }
    );

    private boolean checkStoragePermission(){

        boolean result = ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == (PackageManager.PERMISSION_GRANTED);


        return result;
    }

    private  void requestStoragePermission(){

        ActivityCompat.requestPermissions(this, storagePermissions, STORAGE_REQUEST_CODE);
    }

    private boolean checkCameraPermission(){

        boolean cameraResult = ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == (PackageManager.PERMISSION_GRANTED);
        boolean storageResult = ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == (PackageManager.PERMISSION_GRANTED);

        return cameraResult && storageResult;
    }

    private void requestCameraPermission(){

        ActivityCompat.requestPermissions(this, cameraPermissions, CAMERA_REQUEST_CODE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode){
            case CAMERA_REQUEST_CODE:{

                if (grantResults.length>0){

                    boolean cameraAccepted = grantResults[0] == PackageManager.PERMISSION_GRANTED;
                    boolean storageAccepted = grantResults[1] == PackageManager.PERMISSION_GRANTED;

                    if (cameraAccepted && storageAccepted){
                       
                        pickImageCamera();
                    }
                    else {

                        Toast.makeText(this, "Permissões de Camera e Armazenamento necessárias", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(this, "Cancelado", Toast.LENGTH_SHORT).show();
                }
            }
            break;
            case STORAGE_REQUEST_CODE:{

                if (grantResults.length>0){

                    boolean storageAceepted = grantResults[0] == PackageManager.PERMISSION_GRANTED;

                    if (storageAceepted){

                        pickImageGallery();
                    }
                    else {

                        Toast.makeText(this, "Permissões de Armazenamento necessária", Toast.LENGTH_SHORT).show();
                    }
                }
            }
            break;
        }
    }
}