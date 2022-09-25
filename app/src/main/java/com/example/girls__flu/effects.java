package com.example.girls__flu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class effects extends AppCompatActivity {

    Button menarche, menapause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_effects);

        menarche=findViewById(R.id.menarche);
        menapause=findViewById(R.id.menapause);

        menarche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(effects.this,EC_1.class);
                startActivity(i);
            }
        });

        menapause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(effects.this,EC_1.class);
                startActivity(i);
            }
        });
    }
}