package com.br.tccandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Button;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

   // EditText ET_EMAIL, ET_SENHA;
   // String login_email, login_senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ET_EMAIL = (EditText) findViewById (R.id.email);
        //ET_SENHA = (EditText) findViewById(R.id.senha);
        Button bt_Login = findViewById(R.id.bt_login);

        bt_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userLogin();  // Chama o método userLogin
            }
        });
    }

    // Método chamado quando o botão é clicado
    public void userLogin() {
        // Cria um Intent para iniciar a NovaTelaActivity
        Intent intent = new Intent(this, telaMenu.class);

        // Inicia a nova atividade
        startActivity(intent);
    }

    }

    //public void userLogin(View view){
        //login_email = ET_EMAIL.getText().toString();
        //login_senha = ET_SENHA.getText().toString();

        //String method = "Login";

       // BackgroundTask backgroundtask = new BackgroundTask(this);
       // backgroundtask.execute(method, login_email, login_senha);
   // }
//}