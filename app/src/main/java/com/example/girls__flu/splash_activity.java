package com.example.girls__flu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class splash_activity extends AppCompatActivity {

    ImageView splash_image;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splash_image = findViewById(R.id.firstscreen);
        lottieAnimationView = findViewById(R.id.lottie);

        splash_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(splash_activity.this,MainActivity.class);
                startActivity(i);
            }
        });

        lottieAnimationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(splash_activity.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}