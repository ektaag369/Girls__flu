package com.example.girls__flu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class remedies extends AppCompatActivity {

    Button remedie1;
    Button remedie2;
    Button remedie3;
    Button remedie4;
    Button remedie5;
    Button remedie6;
    Button remedie7;






    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remedies);

        remedie1=findViewById(R.id.remedie_1);
        remedie2=findViewById(R.id.remedie_2);
        remedie3=findViewById(R.id.remedie_3);
        remedie4=findViewById(R.id.remedie_4);
        remedie5=findViewById(R.id.remedie_5);
        remedie6=findViewById(R.id.remedie_6);
        remedie7=findViewById(R.id.remedie_7);

        remedie1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(remedies.this,RC_1.class);
                startActivity(i);
            }
        });

        remedie2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(remedies.this,RC_2.class);
                startActivity(i);
            }
        });

        remedie3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(remedies.this,RC_3.class);
                startActivity(i);
            }
        });

        remedie4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(remedies.this,RC_4.class);
                startActivity(i);
            }
        });

        remedie5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(remedies.this,RC_5.class);
                startActivity(i);
            }
        });

        remedie6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(remedies.this,RC_6.class);
                startActivity(i);
            }
        });

        remedie7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(remedies.this,RC_7.class);
                startActivity(i);
            }
        });
    }
}