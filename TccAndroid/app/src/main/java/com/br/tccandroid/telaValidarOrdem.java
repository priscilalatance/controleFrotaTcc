package com.br.tccandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;

import android.widget.Toast;
import android.os.Handler;
import android.content.Intent;

public class telaValidarOrdem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_validar_ordem);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        final EditText editPlaca = findViewById(R.id.editPlaca);
        String placaVeiculo = getIntent().getStringExtra("placaVeiculo");
        editPlaca.setText(placaVeiculo);

        new ConsultaOrdemTask().execute(placaVeiculo);
    }

    private class ConsultaOrdemTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... params) {
            String response = null;
            try {
                String placa = params[0];
                String encodedPlaca = URLEncoder.encode(placa, "UTF-8");
                URL url = new URL("http://10.0.2.2/TccAndroid/consultaOrdem.php?placaVeiculo=" + encodedPlaca);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");

                InputStream inputStream = connection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder stringBuilder = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    stringBuilder.append(line);
                }
                response = stringBuilder.toString();
                reader.close();
                inputStream.close();
                connection.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return response;
        }

        @Override
        protected void onPostExecute(String result) {
            if (result != null) {
                try {
                    JSONArray jsonArray = new JSONArray(result);
                    LinearLayout linearLayout = findViewById(R.id.cardConsultaOrdemContent);
                    linearLayout.removeAllViews();

                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject jsonObject = jsonArray.getJSONObject(i);
                        Iterator<String> keys = jsonObject.keys();
                        while (keys.hasNext()) {
                            String key = keys.next();
                            String value = jsonObject.getString(key);
                            TextView textView = new TextView(telaValidarOrdem.this);
                            textView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                            textView.setText(key + ": " + value);
                            linearLayout.addView(textView);
                        }
                    }
                    verificarStatusOrdem(jsonArray);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {

            }
        }

        private void verificarStatusOrdem(JSONArray jsonArray) {
            boolean algumAberto = verificarAlgumAberto(jsonArray);
            Button btnValidarOrdem = findViewById(R.id.btnValidarOrdem);
            btnValidarOrdem.setEnabled(true);
            btnValidarOrdem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (algumAberto) {
                        Toast.makeText(telaValidarOrdem.this, "Veículo disponível para agendamento", Toast.LENGTH_SHORT).show();
                        iniciarTelaMenu();
                    } else {
                        new FinalizarOrdemTask().execute();
                    }
                }
            });
        }

        private boolean verificarAlgumAberto(JSONArray jsonArray) {
            boolean algumAberto = false;
            try {
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    String statusOrdem = jsonObject.getString("statusOrdem");
                    if (!statusOrdem.equals("Fechado")) {
                        algumAberto = true;
                        break;
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return algumAberto;
        }

        private void iniciarTelaMenu() {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(telaValidarOrdem.this, telaMenu.class);
                    startActivity(intent);
                    finish();
                }
            }, 6000);
        }

        private class FinalizarOrdemTask extends AsyncTask<Void, Void, Void> {
            @Override
            protected Void doInBackground(Void... voids) {
                final EditText editPlaca = findViewById(R.id.editPlaca);
                String placa = editPlaca.getText().toString();
                try {
                    String encodedPlaca = URLEncoder.encode(placa, "UTF-8");
                    String urlString = "http://10.0.2.2/TccAndroid/finalizarOrdem.php?placaVeiculo=" + encodedPlaca;
                    URL url = new URL(urlString);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                    int responseCode = connection.getResponseCode();
                    connection.disconnect();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                exibirMensagemETransferirParaMenu();
            }
        }

        private void exibirMensagemETransferirParaMenu() {
            Toast.makeText(telaValidarOrdem.this, "Veículo Disponível", Toast.LENGTH_SHORT).show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(telaValidarOrdem.this, telaMenu.class);
                    startActivity(intent);
                    finish();
                }
            }, 4000);
        }
    }
}
