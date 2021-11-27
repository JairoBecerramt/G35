package com.example.chaquetas_reto_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class productosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.productos);

        Button myboton4 = (Button) findViewById(R.id.boton4);
        myboton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View View) {
                Intent tercerpantalla = new Intent(getApplicationContext(), ServiciosActivity.class);
                startActivity(tercerpantalla);
            }


        });


        Button myboton5 = (Button) findViewById(R.id.boton5);
        myboton5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent cuartapantalla = new Intent(getApplicationContext(), SucursalesActivity.class);
                startActivity(cuartapantalla);

            }


        });
        Toast.makeText(this, "En construccion", Toast.LENGTH_LONG).show();
        Resources res1 = getResources();
        Drawable drawable = res1.getDrawable(R.drawable.jacket1, getTheme());

        ImageView imagen1 = (ImageView) findViewById(R.id.imageView1);
        imagen1.setImageDrawable(drawable);


        //-------------------------------------------------------------

        Resources res2 = getResources();
        Drawable drawable2 = res2.getDrawable(R.drawable.jacket2, getTheme());

        ImageView imagen2 = (ImageView) findViewById(R.id.imageView2);
        imagen2.setImageDrawable(drawable2);

        //-------------------------------------------------------------
        Resources res3 = getResources();
        Drawable drawable3 = res3.getDrawable(R.drawable.jacket3, getTheme());

        ImageView imagen3 = (ImageView) findViewById(R.id.imageView3);
        imagen3.setImageDrawable(drawable3);

        //-------------------------------------------------------------

        Resources res4 = getResources();
        Drawable drawable4 = res4.getDrawable(R.drawable.jacket4, getTheme());

        ImageView imagen4 = (ImageView) findViewById(R.id.imageView4);
        imagen4.setImageDrawable(drawable4);

        //-------------------------------------------------------------

        Resources res5 = getResources();
        Drawable drawable5 = res5.getDrawable(R.drawable.jacket5, getTheme());

        ImageView imagen5 = (ImageView) findViewById(R.id.imageView5);
        imagen5.setImageDrawable(drawable5);

        //-------------------------------------------------------------

        Resources res6 = getResources();
        Drawable drawable6 = res6.getDrawable(R.drawable.jacket6, getTheme());

        ImageView imagen6  = (ImageView) findViewById(R.id.imageView6);
        imagen6.setImageDrawable(drawable6);

    }
}


