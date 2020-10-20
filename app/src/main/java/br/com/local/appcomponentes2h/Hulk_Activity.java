package br.com.local.appcomponentes2h;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

public class Hulk_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hulk_layout);
    }

    //Adicionando o menu na janela
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Instânciar o menu na barra do app
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal,menu);

        return super.onCreateOptionsMenu(menu);
    }
}