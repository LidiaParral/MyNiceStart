package com.di.myapp;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class SignUpActivity extends AppCompatActivity {

    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        ImageView mySubtitle = (ImageView) findViewById(R.id.iModa);
        Animation mymain = AnimationUtils.loadAnimation(this, R.anim.faiden);
        mySubtitle.startAnimation(mymain);

        ImageView imagenFondo = (ImageView) findViewById(R.id.iFondo);

        Glide.with(this)
                .load(R.drawable.foto25)
                .centerCrop()
                .transition(DrawableTransitionOptions.withCrossFade(200))
                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.colorSalmon)))
                .into(imagenFondo);


        btnCancel = findViewById(R.id.btnCancel);

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity
                        .this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}


