package com.di.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.alespero.expandablecardview.ExpandableCardView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ExpandableCardView card = findViewById(R.id.profile);
        card.setOnExpandedListener((v, isExpanded) -> Toast.makeText(MainActivity2.this, isExpanded ? "Expanded!" :
                "Collapsed!", Toast.LENGTH_SHORT).show());


    }

    public void volver(View view) {
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

        finish();
    }

    public void ok(View view) {
        Intent intent = new Intent(getApplicationContext(), AppBarActivity.class);
        startActivity(intent);

    }
}