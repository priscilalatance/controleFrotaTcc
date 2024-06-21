package com.br.tccandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ET_EMAIL, ET_SENHA;
    String login_email, login_senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ET_EMAIL = (EditText) findViewById (R.id.email);
        ET_SENHA = (EditText) findViewById(R.id.senha);


    }

    public void userLogin(View view){
        login_email = ET_EMAIL.getText().toString();
        login_senha = ET_SENHA.getText().toString();

        String method = "Login";

        BackgroundTask backgroundtask = new BackgroundTask(this);
        backgroundtask.execute(method, login_email, login_senha);
    }
}