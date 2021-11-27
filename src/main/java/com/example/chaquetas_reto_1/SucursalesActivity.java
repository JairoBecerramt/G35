package com.example.chaquetas_reto_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class SucursalesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sucursales);

        Button myboton6 = (Button) findViewById(R.id.boton6);
        myboton6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent primerpantalla = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(primerpantalla);
            }

        });

        Resources res11 = getResources();
        Drawable drawable11 = res11.getDrawable(R.drawable.map, getTheme());

        ImageView imagen11 = (ImageView) findViewById(R.id.imageView11);
        imagen11.setImageDrawable(drawable11);
        Toast.makeText(this, "En construccion", Toast.LENGTH_LONG).show();
    }
}