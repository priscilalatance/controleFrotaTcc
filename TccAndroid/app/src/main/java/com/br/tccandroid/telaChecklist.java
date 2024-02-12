package com.br.tccandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

public class telaChecklist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_checklist);

        // Recupera os conteúdos dos EditTexts da atividade anterior
        String conteudoRecebidoOdometro = getIntent().getStringExtra("CONTEUDO_EDIT_TEXT_ODOMETRO");
        String conteudoRecebidoPlaca = getIntent().getStringExtra("CONTEUDO_EDIT_TEXT_PLACA");

        // Exibe os conteúdos em EditTexts (ou faça o que precisar com os conteúdos)
        EditText editTextKmAtual = findViewById(R.id.editTextKmAtual);
        editTextKmAtual.setText(conteudoRecebidoOdometro);

        EditText editTextPlaca = findViewById(R.id.editTextPlaca);
        editTextPlaca.setText(conteudoRecebidoPlaca);

        EditText editTextData = findViewById(R.id.editTextData);

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        String dataAtual = dateFormat.format(calendar.getTime());

        editTextData.setText(dataAtual);

        // Obtém a placa do veículo
        String placaVeiculo = editTextPlaca.getText().toString();

        new AsyncTask<String, Void, Map<String, List<String>>>() {
            @Override
            protected Map<String, List<String>> doInBackground(String... params) {
                String placaVeiculo = params[0];

                // Aqui você faria a chamada à sua API para obter as peças universais e específicas com base na placa.
                // Retorna um Map onde a chave "universais" aponta para a lista de peças universais e "especificos" aponta para a lista de peças específicas.
                Map<String, List<String>> resultado = new HashMap<>();
                resultado.put("universais", obterPecasUniversais());
                resultado.put("especificos", obterPecasPorPlaca(placaVeiculo));
                return resultado;
            }


            @Override
            protected void onPostExecute(Map<String, List<String>> resultados) {
                // Combina as listas de peças universais e específicas
                List<String> todasPecas = new ArrayList<>();
                todasPecas.addAll(resultados.get("universais"));
                todasPecas.addAll(resultados.get("especificos"));

                // Adiciona checkboxes dinamicamente ao LinearLayout
                adicionarCheckBoxes(todasPecas);
            }

            private List<String> obterPecasUniversais() {
                List<String> pecasUniversais = new ArrayList<>();

                try {
                    // Constrói a URL para a chamada à API PHP para obter todas as peças universais
                    String url = "http://10.0.2.2/TccAndroid/obterPecasUniversais.php";

                    // Faz a requisição à API PHP e obtém a resposta
                    String resposta = fazerRequisicaoHttp(url);

                    // Converte a resposta (JSON) para uma lista de Strings
                    pecasUniversais = converterJsonParaLista(resposta);
                } catch (IOException | JSONException e) {
                    e.printStackTrace();
                }

                return pecasUniversais;
            }

            private List<String> obterPecasPorPlaca(String placaVeiculo) {
                List<String> pecas = new ArrayList<>();

                try {
                    // Constrói a URL para a chamada à API PHP
                    String url = "http://10.0.2.2/TccAndroid/obterPecasPorPlaca.php?placaVeiculo=" + placaVeiculo;

                    // Faz a requisição à API PHP e obtém a resposta
                    String resposta = fazerRequisicaoHttp(url);

                    // Converte a resposta (JSON) para uma lista de Strings
                    pecas = converterJsonParaLista(resposta);
                } catch (IOException | JSONException e) {
                    e.printStackTrace();
                }

                return pecas;
            }

            private String fazerRequisicaoHttp(String urlString) throws IOException {
                URL url = new URL(urlString);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

                try {
                    InputStream in = urlConnection.getInputStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                    StringBuilder result = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        result.append(line);
                    }
                    return result.toString();
                } catch (ConnectException e) {
                    // Lidar com a exceção de conexão recusada aqui
                    e.printStackTrace();
                    return null;
                } finally {
                    urlConnection.disconnect();
                }
            }

            private List<String> converterJsonParaLista(String json) throws JSONException {
                List<String> lista = new ArrayList<>();
                JSONArray jsonArray = new JSONArray(json);
                for (int i = 0; i < jsonArray.length(); i++) {
                    lista.add(jsonArray.getString(i));
                }
                return lista;
            }

            private void adicionarCheckBoxes(List<String> pecas) {
                // Inicializar o LinearLayout que conterá os checkboxes
                LinearLayout linearLayout = findViewById(R.id.seuLinearLayout);

                for (String peca : pecas) {
                    // Criar um novo CheckBox para cada item
                    CheckBox checkBox = new CheckBox(telaChecklist.this);
                    checkBox.setText(peca);

                    // Adicionar o CheckBox ao LinearLayout
                    linearLayout.addView(checkBox);
                }
            }
        }.execute(placaVeiculo);
    }
}
