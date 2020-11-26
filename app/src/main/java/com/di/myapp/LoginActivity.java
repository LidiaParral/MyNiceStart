package com.di.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        ImageView mySubtitle = (ImageView) findViewById(R.id.iModa);
        Animation mymain = AnimationUtils.loadAnimation(this, R.anim.faiden);
        mySubtitle.startAnimation(mymain);

        Button btnSignUp = (Button) findViewById(R.id.btnSignUp);

    }



}

