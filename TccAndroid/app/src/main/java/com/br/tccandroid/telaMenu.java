package com.br.tccandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class telaMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_menu);

        Button btnOsr = findViewById(R.id.btnOsr);
        Button  btnIrParaChecklist = findViewById(R.id.btnIrParaChecklist);

        btnOsr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaMenu.this, telaOCR.class);
                startActivity(intent);
            }
        });

        btnIrParaChecklist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaMenu.this, telaChecklist.class);
                startActivity(intent);
            }
        });
    }
}
