package com.example.kraken.zadanie_rekrutacyjne_android_developer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements Runnable {

    String[] mojaLista;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonStart = (Button) findViewById(R.id.buttonStartID);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goStart = new Intent(mojaLista.run());
                startActivity(goStart);
            }
        });

        Button buttonStop = (Button) findViewById(R.id.buttonStopID);
        buttonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goStop = new Intent(watek.KILLIM);
                startActivity(goStop);
            }
        });

        Button buttonReset = findViewById(R.id.buttonResetID);
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goReset = new Intent(R.id.lisViewID.)
            }
        });
    }

    @Override
    public void run() {

    }
}
