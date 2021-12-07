package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pregunta1 extends Activity implements View.OnClickListener {
    Button a,b,c,d,sig;
    int calificacion=0;
    Intent i;
    @Override
    protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.pregunta1);
            i=new Intent(pregunta1.this, Pregunta2.class);
            a= (Button) findViewById(R.id.a1);
            b=(Button) findViewById(R.id.b1);
            c=(Button) findViewById(R.id.c1);
            sig=(Button) findViewById(R.id.sig);
            a.setOnClickListener(this);
            b.setOnClickListener(this);
            c.setOnClickListener(this);
            sig.setOnClickListener(this);
            sig.setEnabled(false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.a1://respuesta correcta
                calificacion=1;
                deshabilitar();

                break;
            case R.id.b1:
                calificacion=0;
                deshabilitar();
                break;
            case R.id.c1:
                calificacion=0;
                deshabilitar();
                break;
            case R.id.sig:
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
