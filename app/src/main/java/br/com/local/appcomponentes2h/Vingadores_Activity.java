package br.com.local.appcomponentes2h;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Vingadores_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vingadores_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_vingadores, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mCAmerica:
                startActivity(new Intent(getApplicationContext(),
                        CAmerica_Activity.class));
                break;
            case R.id.mHomenFerro:
                startActivity(new Intent(getApplicationContext(),
                        HFerro_Activity.class));
                break;
            case R.id.mHulk:
                startActivity(new Intent(getApplicationContext(),
                        Hulk_Activity.class));
                break;
            case R.id.mGArqueiro:
                startActivity(new Intent(getApplicationContext(),
                        GArqueiro_Activity.class));

                break;
            case R.id.mViuvaNegra:
                startActivity(new Intent(getApplicationContext(),
                        VNegra_Activity.class));
                break;
        }
        return true;
    }
}