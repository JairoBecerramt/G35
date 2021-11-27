package com.example.chaquetas_reto_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myboton1 = (Button) findViewById(R.id.boton1);
        myboton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent segundapantalla = new Intent(getApplicationContext(), productosActivity.class);
                startActivity(segundapantalla);
            }

        });

        Button myboton2 = (Button) findViewById(R.id.boton4);
        myboton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent tercerpantalla = new Intent(getApplicationContext(), ServiciosActivity.class);
                startActivity(tercerpantalla);
            }

        });

        Button myboton3 = (Button) findViewById(R.id.boton3);
        myboton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent cuartapantalla = new Intent(getApplicationContext(), SucursalesActivity.class);
                startActivity(cuartapantalla);
            }

        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.productos) {
            Intent segundapantalla = new Intent(getApplicationContext(), productosActivity.class);
            startActivity(segundapantalla);

        }
        if (id == R.id.servicios) {
            Intent tercerpantalla = new Intent(getApplicationContext(), ServiciosActivity.class);
            startActivity(tercerpantalla);

        }
        if (id == R.id.sucursales) {
            Intent cuartapantalla = new Intent(getApplicationContext(), SucursalesActivity.class);
            startActivity(cuartapantalla);
        }

        return super.onOptionsItemSelected(item);
    }


}