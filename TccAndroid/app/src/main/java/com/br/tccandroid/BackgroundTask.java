package com.br.tccandroid;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class BackgroundTask extends AsyncTask<String, Void, String> {

    AlertDialog alertDialog;
    Context ctx;
    String login_name;
    String login_pass;

    BackgroundTask(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    protected void onPreExecute() {
        alertDialog = new AlertDialog.Builder(ctx).create();
        alertDialog.setTitle("Informações do Login....");
    }

    @Override
    protected String doInBackground(String... params) {
        String reg_url = "http://192.168.0.111/TccAndroid/registro.php";
        String login_url = "http://192.168.0.111/TccAndroid/login.php";
        String method = params[0];

        if (method.equals("Registro")) {
            // Implementação para registro se necessário
        } else if (method.equals("Login")) {
            login_name = params[1];
            login_pass = params[2];

            try {
                URL url = new URL(login_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                String data = URLEncoder.encode("login_email", "UTF-8") + "=" + URLEncoder.encode(login_name, "UTF-8") + "&" +
                        URLEncoder.encode("login_senha", "UTF-8") + "=" + URLEncoder.encode(login_pass, "UTF-8");
                bufferedWriter.write(data);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();

                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1"));
                String response = "";
                String line = "";
                while ((line = bufferedReader.readLine()) != null) {
                    response += line;
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();

                return response;

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(String result) {
        if (result != null && result.equals("Registrado com Sucesso...")) {
            Toast.makeText(ctx, result, Toast.LENGTH_LONG).show();
        } else if (result != null && result.equals("Login_Success")) {
            // Armazenar o email e a senha no SharedPreferences
            SharedPreferences sharedPreferences = ctx.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("email", login_name);
            editor.putString("senha", login_pass);
            editor.apply();

            // Inicia a nova tela (telaMenu)
            Intent intent = new Intent(ctx, telaMenu.class);
            ctx.startActivity(intent);
        } else {
            alertDialog.setMessage(result != null ? result : "Erro durante o login.");
            alertDialog.show();
        }
    }
}
