package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainQuiz extends Activity {
    Intent i;
    Button iniciar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_quiz);
        i = new Intent(MainQuiz.this, pregunta1.class);
        iniciar=(Button) findViewById(R.id.iniciar);
        iniciar.setOnClickListener(new onClickListener() {

            @Override
            public void onClick(View arg0) {
                startActivity(i);
            }

        });
    }
}


