package com.di.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {
    private Button btnSignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);



        ImageView mySubtitle = (ImageView) findViewById(R.id.iModa);
        Animation mymain = AnimationUtils.loadAnimation(this, R.anim.faiden);
        mySubtitle.startAnimation(mymain);

        btnSignUp = findViewById(R.id.btnSignUp);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity
                        .this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        openApp(true);
    }


    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SignUpActivity
                        .this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }



}

