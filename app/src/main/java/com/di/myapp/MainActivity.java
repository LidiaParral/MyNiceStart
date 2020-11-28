package com.di.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ok(View view) {
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
//Pesionar el botón retorno del dispositivo para salir de la app: NO funciona*
    @Override
    public void onBackPressed() {
        if(contador == 0){
            Toast.makeText(getApplicationContext(),"Saliendo de la aplicación",Toast.LENGTH_LONG);
            contador++;
        } else{
            super.onBackPressed();
        }

        new CountDownTimer(3000,1000){

            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                contador = 0;
            }
        }.start();
    }
}