package com.br.tccandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

public class telaChecklist extends AppCompatActivity {

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
            e.printStackTrace();
            return null;
        } finally {
            urlConnection.disconnect();
        }
    }

    private String marca;
    private String modelo;
    private String motor;
    private int anoModelo;
    private int anoFabricacao;

    private String dataCheck;

    private CardView cardKit;
    private String placaVeiculo;
    private EditText editTextPlaca;

    private String email;
    private String senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_checklist);

        dataCheck = getCurrentDate();

        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        email = sharedPreferences.getString("email", "");
        senha = sharedPreferences.getString("senha", "");


        if (email == null || senha == null) {
            Toast.makeText(this, "Erro: Email ou senha não foram recebidos.", Toast.LENGTH_LONG).show();
            return;
        }

        String conteudoRecebidoOdometro = getIntent().getStringExtra("CONTEUDO_EDIT_TEXT_ODOMETRO");
        String conteudoRecebidoPlaca = getIntent().getStringExtra("CONTEUDO_EDIT_TEXT_PLACA");

        EditText editTextKmAtual = findViewById(R.id.editTextKmAtual);
        editTextKmAtual.setText(conteudoRecebidoOdometro);

        editTextPlaca = findViewById(R.id.editTextPlaca);
        editTextPlaca.setText(conteudoRecebidoPlaca);

        placaVeiculo = editTextPlaca.getText().toString();

        if (placaVeiculo == null || placaVeiculo.isEmpty()) {
            Toast.makeText(this, "Erro: Placa do veículo não foi recebida.", Toast.LENGTH_LONG).show();
            return;
        }

        cardKit = findViewById(R.id.cardKit);

        EditText editTextData = findViewById(R.id.editTextData);

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        String dataAtual = dateFormat.format(calendar.getTime());

        editTextData.setText(dataAtual);

        Button btnGerarLista = findViewById(R.id.btngerarLista);
        btnGerarLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textViewNomesSelecionados = findViewById(R.id.textViewNomesSelecionados);
                textViewNomesSelecionados.setText("");
                dataCheck = getCurrentDate();
                exibirNomesCheckBoxesSelecionados(email, senha, placaVeiculo);

                Toast.makeText(telaChecklist.this, "Ordem de serviço gerada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(telaChecklist.this, telaValidarOrdem.class);
                intent.putExtra("placaVeiculo", placaVeiculo);
                startActivity(intent);
                onStop();
            }
        });

        buscarModeloCarro(placaVeiculo);

        new AsyncTask<String, Void, Map<String, List<String>>>() {
            @Override
            protected Map<String, List<String>> doInBackground(String... params) {
                String placaVeiculo = params[0];

                Map<String, List<String>> resultado = new HashMap<>();
                resultado.put("universais", obterPecasUniversais());
                resultado.put("especificos", obterPecasPorPlaca(placaVeiculo));
                return resultado;
            }

            @Override
            protected void onPostExecute(Map<String, List<String>> resultados) {
                List<String> todasPecas = new ArrayList<>();
                todasPecas.addAll(resultados.get("universais"));
                todasPecas.addAll(resultados.get("especificos"));
                adicionarCheckBoxes(todasPecas);
            }

            private List<String> obterPecasUniversais() {
                List<String> pecasUniversais = new ArrayList<>();

                try {
                    String url = "http://10.0.2.2/TccAndroid/obterPecasUniversais.php";
                    String resposta = fazerRequisicaoHttp(url);
                    pecasUniversais = converterJsonParaLista(resposta);
                } catch (IOException | JSONException e) {
                    e.printStackTrace();
                }

                return pecasUniversais;
            }

            private List<String> obterPecasPorPlaca(String placaVeiculo) {
                List<String> pecas = new ArrayList<>();

                try {
                    String url = "http://10.0.2.2/TccAndroid/obterPecasPorPlaca.php?placaVeiculo=" + placaVeiculo;
                    String resposta = fazerRequisicaoHttp(url);
                    pecas = converterJsonParaLista(resposta);
                } catch (IOException | JSONException e) {
                    e.printStackTrace();
                }

                return pecas;
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
                LinearLayout linearLayout = findViewById(R.id.seuLinearLayout);

                for (String peca : pecas) {
                    CheckBox checkBox = new CheckBox(telaChecklist.this);
                    checkBox.setText(peca);
                    linearLayout.addView(checkBox);
                }
            }
        }.execute(placaVeiculo);

        imprimirKitManutencao(placaVeiculo);
    }

    @Override
    protected void onStop() {
        super.onStop();

        // Definir todas as variáveis como nulas
        marca = null;
        modelo = null;
        motor = null;
        anoModelo = 0;
        anoFabricacao = 0;
        dataCheck = null;
        placaVeiculo = null;
        editTextPlaca = null;
        email = null;
        senha = null;
    }

    private void buscarModeloCarro(String placaVeiculo) {
        new AsyncTask<String, Void, String>() {
            @Override
            protected String doInBackground(String... params) {
                String placaVeiculo = params[0];
                String url = "http://10.0.2.2/TccAndroid/consultaModeloVeiculo.php?placaVeiculo=" + placaVeiculo;

                try {
                    return fazerRequisicaoHttp(url);
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            }

            @Override
            protected void onPostExecute(String modeloCarro) {
                if (modeloCarro != null && !modeloCarro.isEmpty()) {
                    EditText editTextModeloCarro = findViewById(R.id.editTextModelo);
                    editTextModeloCarro.setText(modeloCarro);
                } else {
                    Toast.makeText(telaChecklist.this, "Não foi possível obter o modelo do carro.", Toast.LENGTH_SHORT).show();
                }
            }
        }.execute(placaVeiculo);
    }

    private void imprimirKitManutencao(String placaVeiculo) {
        new AsyncTask<String, Void, String>() {
            @Override
            protected String doInBackground(String... params) {
                String placaVeiculo = params[0];
                String url = "http://10.0.2.2/TccAndroid/obterKitManut.php?placaVeiculo=" + placaVeiculo;
                try {
                    String resposta = fazerRequisicaoHttp(url);
                    return resposta;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPostExecute(String resposta) {
                if (resposta != null && !resposta.isEmpty()) {
                    String[] dadosKmManutencaoArray = resposta.split("\n");
                    List<String> dadosKmManutencao = Arrays.asList(dadosKmManutencaoArray);
                    exibirKitManutencao(dadosKmManutencao);

                    new AsyncTask<String, Void, Void>() {
                        @Override
                        protected Void doInBackground(String... params) {
                            String placaVeiculo = params[0];

                            try {
                                String urlString = "http://10.0.2.2/TccAndroid/insertOrdemPreventiva.php" +
                                        "?placaVeiculo=" + URLEncoder.encode(placaVeiculo, "UTF-8") +
                                        "&data_check=" + URLEncoder.encode(dataCheck, "UTF-8") +
                                        "&email=" + URLEncoder.encode(email, "UTF-8") +
                                        "&senha=" + URLEncoder.encode(senha, "UTF-8");
                                URL phpUrl = new URL(urlString);
                                HttpURLConnection conn = (HttpURLConnection) phpUrl.openConnection();
                                conn.setRequestMethod("GET");
                                InputStream is = conn.getInputStream();
                                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                                String line;
                                StringBuilder response = new StringBuilder();
                                while ((line = reader.readLine()) != null) {
                                    response.append(line);
                                }
                                reader.close();
                                is.close();
                                conn.disconnect();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                            return null;
                        }
                    }.execute(placaVeiculo);
                } else {
                    Toast.makeText(telaChecklist.this, "Não foi possível obter o kit de manutenção.", Toast.LENGTH_SHORT).show();
                }
            }
        }.execute(placaVeiculo);
    }

    private void exibirKitManutencao(List<String> dadosKmManutencao) {
        LinearLayout linearLayout = findViewById(R.id.cardKitContent);

        for (String valor : dadosKmManutencao) {
            TextView textView = new TextView(this);
            textView.setText(valor);
            linearLayout.addView(textView);
            TextView lineBreak = new TextView(this);
            lineBreak.setText("\n");
            linearLayout.addView(lineBreak);
        }
    }

    private void exibirNomesCheckBoxesSelecionados(String email, String senha, String placaVeiculo) {
        StringBuilder nomesCheckBoxes = new StringBuilder();
        LinearLayout linearLayout = findViewById(R.id.seuLinearLayout);

        String dataCheck = getCurrentDate();

        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            View childView = linearLayout.getChildAt(i);
            if (childView instanceof CheckBox) {
                CheckBox checkBox = (CheckBox) childView;
                if (checkBox.isChecked()) {
                    String nomeCheckBox = checkBox.getText().toString();
                    int indexCod = nomeCheckBox.indexOf("Cod");
                    int indexTraco = nomeCheckBox.indexOf("-");
                    if (indexCod != -1 && indexTraco != -1 && indexCod < indexTraco) {
                        String numero = nomeCheckBox.substring(indexCod + 3, indexTraco).trim();
                        nomesCheckBoxes.append(numero);
                    }
                    nomesCheckBoxes.append(",");
                }
            }
        }

        TextView textViewNomesSelecionados = findViewById(R.id.textViewNomesSelecionados);
        textViewNomesSelecionados.setText(nomesCheckBoxes.toString());

        insertOrdem(placaVeiculo, dataCheck, email, senha, nomesCheckBoxes.toString());

        String[] numeros = nomesCheckBoxes.toString().split(",");
        for (String numero : numeros) {
            salvarItem(numero);
        }
    }

    private void insertOrdem(String placaVeiculo, String dataCheck, String email, String senha, String itensSelecionados) {
        new AsyncTask<String, Void, Void>() {
            @Override
            protected Void doInBackground(String... params) {
                String placaVeiculo = params[0];
                String dataCheck = params[1];
                String email = params[2];
                String senha = params[3];
                String itensSelecionados = params[4];

                try {
                    String urlString = "http://10.0.2.2/TccAndroid/insertOrdem.php" +
                            "?placa_veiculo=" + URLEncoder.encode(placaVeiculo, "UTF-8") +
                            "&data_check=" + URLEncoder.encode(dataCheck, "UTF-8") +
                            "&itens_selecionados=" + URLEncoder.encode(itensSelecionados, "UTF-8") +
                            "&email=" + URLEncoder.encode(email, "UTF-8") +
                            "&senha=" + URLEncoder.encode(senha, "UTF-8");
                    URL phpUrl = new URL(urlString);
                    HttpURLConnection conn = (HttpURLConnection) phpUrl.openConnection();
                    conn.setRequestMethod("GET");
                    InputStream is = conn.getInputStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                    String line;
                    StringBuilder response = new StringBuilder();
                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }
                    reader.close();
                    is.close();
                    conn.disconnect();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                return null;
            }
        }.execute(placaVeiculo, dataCheck, email, senha, itensSelecionados);
    }

    private void salvarItem(String numero) {
        new AsyncTask<String, Void, Void>() {
            @Override
            protected Void doInBackground(String... params) {
                String numero = params[0];

                try {
                    String url = "http://10.0.2.2/TccAndroid/salvarItens.php?numero=" + numero;
                    URL phpUrl = new URL(url);
                    HttpURLConnection conn = (HttpURLConnection) phpUrl.openConnection();
                    conn.setRequestMethod("GET");
                    InputStream is = conn.getInputStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                    String line;
                    StringBuilder response = new StringBuilder();
                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }
                    reader.close();
                    is.close();
                    conn.disconnect();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                return null;
            }
        }.execute(numero);
    }

    private String getCurrentDate() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        return dateFormat.format(calendar.getTime());
    }
}
