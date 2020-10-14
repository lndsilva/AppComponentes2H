package br.com.local.appcomponentes2h;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EsqueceuSenha_Activity extends AppCompatActivity {

    EditText txtRecuperarEmail;
    Button btnRecuperarSenha, btnLogar, btnCadastrarUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esqueceu_senha_layout);

        txtRecuperarEmail = findViewById(R.id.txtRecuperarEmail);
        btnRecuperarSenha = findViewById(R.id.btnRecuperarSenha);
        btnLogar = findViewById(R.id.btnVoltarLogin);
        btnCadastrarUsuario = findViewById(R.id.btnCadastrarUsuario);

        btnRecuperarSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "senha enviada para seu E-mail",
                        Toast.LENGTH_SHORT).show();
                txtRecuperarEmail.setText("");

            }
        });
        btnLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        Login_Activity.class));
            }
        });
        btnCadastrarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        CadastrarUsuario_Activity.class));
            }
        });

    }
}