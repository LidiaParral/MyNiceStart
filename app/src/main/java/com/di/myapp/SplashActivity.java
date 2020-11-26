package com.di.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);



        ImageView mySubtitle = (ImageView) findViewById(R.id.iModa);
        Animation mymain = AnimationUtils.loadAnimation(this, R.anim.faiden);
        mySubtitle.startAnimation(mymain);


        openApp(true);
    }


    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity
                        .this, SignUpActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }


}
