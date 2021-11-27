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

public class ServiciosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.servicios);

        Button myboton6 = (Button) findViewById(R.id.boton6);
        myboton6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent primerpantalla = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(primerpantalla);

            }

        });
        Toast.makeText(this, "En construccion", Toast.LENGTH_LONG).show();
        Resources res8 = getResources();
        Drawable drawable8 = res8.getDrawable(R.drawable.bicicleta, getTheme());

        ImageView imagen8 = (ImageView) findViewById(R.id.imageView8);
        imagen8.setImageDrawable(drawable8);


        //***************************************************************

        Resources res9 = getResources();
        Drawable drawable9 = res8.getDrawable(R.drawable.tc, getTheme());

        ImageView imagen9 = (ImageView) findViewById(R.id.imageView9);
        imagen9.setImageDrawable(drawable9);

        //***************************************************************

        Resources res10 = getResources();
        Drawable drawable10 = res10.getDrawable(R.drawable.diseno, getTheme());

        ImageView imagen10 = (ImageView) findViewById(R.id.imageView10);
        imagen10.setImageDrawable(drawable10);

    }
}