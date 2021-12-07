package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

public class Score extends Activity {
    Intent i, recibe;
    Bundle bolsa;
    int calificacion = 0;
    Button reg;
    TextView txt;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.score);
        reg = (Button) findViewById(R.id.regresar);
        txt = (TextView) findViewById(R.id.score);
        i = new Intent(Score.this, MainQuiz.class);
        try {
            recibe = getIntent();
            bolsa = recibe.getExtras();
            calificacion = bolsa.getInt("calificacion");
            txt.setText("Score:" + calificacion);

        } catch (Exception e) {
            Toast.makeText(this, "Error al recibir datos", Toast.LENGTH_SHORT).show();
        }
    }   reg.setOnClickListener(new onClickListener() {

        @Override
        public void onClick(View arg0){
            startActivity(i);
        }
    });
}
