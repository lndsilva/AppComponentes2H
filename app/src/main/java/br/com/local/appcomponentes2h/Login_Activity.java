package br.com.local.appcomponentes2h;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {

    Button btnEntrar, btnSair;
    EditText txtEmailUsu, txtSenhaUsu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        btnEntrar = findViewById(R.id.btEntrar);
        btnSair = findViewById(R.id.btSair);
        txtEmailUsu = findViewById(R.id.txtEmailUsu);
        txtSenhaUsu = findViewById(R.id.txtSenhaUsu);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Transformando as variáveis edittext em string

                String email = txtEmailUsu.getText().toString();
                String senha = txtSenhaUsu.getText().toString();

                if (email.equals("etecia") && senha.equals("etecia")) {
                    startActivity(new Intent(getApplicationContext(),
                            MenuPrincipal_Activity.class));
                    //realiza o foco no objeto em tempo de execução.
                    txtEmailUsu.requestFocus();
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Usuário ou senha inválidos!!!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}