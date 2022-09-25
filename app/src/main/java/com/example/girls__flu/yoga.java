package com.example.girls__flu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yoga extends AppCompatActivity {
    Button yoga1,yoga2,yoga3,yoga4,yoga5,yoga6,yoga7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);

        yoga1=findViewById(R.id.yoga_1);
        yoga2=findViewById(R.id.yoga_2);
        yoga3=findViewById(R.id.yoga_3);
        yoga4=findViewById(R.id.yoga_4);
        yoga5=findViewById(R.id.yoga_5);
        yoga6=findViewById(R.id.yoga_6);
        yoga7=findViewById(R.id.yoga_7);

        yoga1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(yoga.this,YC_1.class);
                startActivity(i);
            }
        });

        yoga2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(yoga.this,YC_2.class);
                startActivity(i);
            }
        });

        yoga3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(yoga.this,YC_3.class);
                startActivity(i);
            }
        });

        yoga4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(yoga.this,YC_4.class);
                startActivity(i);
            }
        });

        yoga5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(yoga.this,YC_5.class);
                startActivity(i);
            }
        });

        yoga6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(yoga.this,YC_6.class);
                startActivity(i);
            }
        });

        yoga7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(yoga.this,YC_7.class);
                startActivity(i);
            }
        });
    }
}