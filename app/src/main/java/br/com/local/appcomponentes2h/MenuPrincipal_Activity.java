package br.com.local.appcomponentes2h;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MenuPrincipal_Activity extends AppCompatActivity implements View.OnClickListener {
    //Criar uma variável ou atributo global do objeto do xml
    ImageButton imbHistoria, imbArmadura,
            imbJarvis, imbPepperPots,
            imbEmpresaStark, imbVingadores;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Liga o Classe ao layout através do R.java
        setContentView(R.layout.menu_principal_layout);

        //realizei a ligação do objeto xml com o java
        imbHistoria = findViewById(R.id.imbHistoria);
        imbArmadura = findViewById(R.id.imbArmadura);
        imbJarvis = findViewById(R.id.imbJarvis);
        imbPepperPots = findViewById(R.id.imbPepperPots);
        imbEmpresaStark = findViewById(R.id.imbEmpresaStark);
        imbVingadores = findViewById(R.id.imbVingadores);

        imbHistoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Historia_Activity.class));
            }
        });

        imbArmadura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Armaduras_Activity.class));
            }
        });
        imbJarvis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Jarvis_Activity.class));
            }
        });
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.imbJarvis:
                 startActivity(new Intent(getApplicationContext(), Jarvis_Activity.class));
                break;


        }

    }
}