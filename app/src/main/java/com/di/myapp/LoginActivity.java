package com.di.myapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {


    TextView tvAccount;
    Button btnLogin;
    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        ImageView mySubtitle = (ImageView) findViewById(R.id.iModa);
        Animation mymain = AnimationUtils.loadAnimation(this, R.anim.faiden);
        mySubtitle.startAnimation(mymain);


        tvAccount = findViewById(R.id.tvAccount);
        tvAccount.setOnClickListener((v) -> {
            Intent i = new Intent(LoginActivity.this, SignUpActivity.class);
            startActivity(i);

        });

    }


    public void login(View view) {
        Intent i = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(i);

    }

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