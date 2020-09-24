package br.com.local.appcomponentes2h;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MenuPrincipal_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Liga o Classe ao layout através do R.java
        setContentView(R.layout.menu_principal_layout);
    }

    public void abrirHistoria(View view) {
        //mostrar mensagem na janela do android
        /*Toast.makeText(getApplicationContext(),
                "Cliquei em história!!!",
                Toast.LENGTH_SHORT).show();*/
        //abrir a janela de história
        Intent intent = new Intent(getApplicationContext(), Historia_Activity.class);
        startActivity(intent);
        //fecha a janela atual
        //finish();


    }

    public void abrirArmaduras(View view) {
        //mostrar mensagem na janela do android
        Toast.makeText(getApplicationContext(),
                "Cliquei em Armaduras!!!",
                Toast.LENGTH_SHORT).show();
    }

    public void abrirJarvis(View view) {
        //mostrar mensagem na janela do android
        Toast.makeText(getApplicationContext(),
                "Cliquei em Jarvis!!!",
                Toast.LENGTH_SHORT).show();
    }

    public void abrirPepperPots(View view) {
        //mostrar mensagem na janela do android
        Toast.makeText(getApplicationContext(),
                "Cliquei em Pepper Pots!!!",
                Toast.LENGTH_SHORT).show();
    }

    public void abrirEmpresaStark(View view) {
        //mostrar mensagem na janela do android
        Toast.makeText(getApplicationContext(),
                "Cliquei em Empresa Stark!!!",
                Toast.LENGTH_SHORT).show();
    }

    public void abrirVingadores(View view) {
        //mostrar mensagem na janela do android
        Toast.makeText(getApplicationContext(),
                "Cliquei em Vingadores!!!",
                Toast.LENGTH_SHORT).show();
    }
}