package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Pregunta5 extends Activity implements View.OnClickListener {
    Button a,b,c,d,sig;
    int calificacion=0;
    Intent i, recibe;
    Bundle bolsa;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta5);
        i=new Intent(Pregunta5.this, Score.class);
        a=(Button) findViewById(R.id.a5);
        b=(Button) findViewById(R.id.b5);
        c=(Button) findViewById(R.id.c5);
        sig=(Button) findViewById(R.id.sig5);
        try {
            recibe = getIntent();
            bolsa = recibe.getExtras();
            calificacion = bolsa.getInt("calificacion");
        } catch (Exception e) {
            Toast.makeText(this, "Error al recibir datos", Toast.LENGTH_SHORT).show();
        }
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        sig.setOnClickListener(this);
        sig.setEnabled(false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.a5://respuesta correcta
                calificacion=1;
                deshabilitar();
                break;
            case R.id.b5:
                calificacion=0;
                deshabilitar();
                break;
            case R.id.c5:
                calificacion=0;
                deshabilitar();
                break;
            case R.id.sig5:
                startActivity(i);
                break;
            default:
                break;
        }
        i.putExtra("calificacion", calificacion);
    }

    public void deshabilitar(){
        a.setBackgroundColor(Color.GREEN);
        b.setBackgroundColor(Color.RED);
        c.setBackgroundColor(Color.RED);
        a.setEnabled(false);
        b.setEnabled(false);
        c.setEnabled(false);
        sig.setEnabled(true);
    }


}