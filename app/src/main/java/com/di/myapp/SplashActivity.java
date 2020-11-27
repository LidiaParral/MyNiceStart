package com.di.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);



        TextView title = (TextView) findViewById(R.id.tvDress);
        Animation mymain = AnimationUtils.loadAnimation(this, R.anim.textview);
        title.startAnimation(mymain);

        TextView subtitle = (TextView) findViewById(R.id.tvVintage);
        Animation mymain2 = AnimationUtils.loadAnimation(this, R.anim.textview);
        subtitle.startAnimation(mymain2);



        openApp(true);
    }


    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity
                        .this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }


}
