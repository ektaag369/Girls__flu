package com.example.girls__flu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    ImageView yoga, myth, rec, effects, remedies;
    Button signout;
    FirebaseAuth auth = FirebaseAuth.getInstance();
    Switch a_switch;

    public static final String MYPREFERENCES="nightModePrefs";
    public static final String KEY_ISNIGHTMODE="isNightMode";
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences= getSharedPreferences(MYPREFERENCES, Context.MODE_PRIVATE);

//        signout=findViewById(R.id.logout);
        remedies=findViewById(R.id.m_remedies);
        effects=findViewById(R.id.m_effects);
        myth=findViewById(R.id.m_myth);
        yoga=findViewById(R.id.m_yoga);
        rec=findViewById(R.id.m_rec);
//        a_switch=findViewById(R.id.a_switch);
//        signout = findViewById(R.id.logout);

//        checkNightModeActivated();
//
//        a_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if(isChecked){
//                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
//                    saveNightModeState(true);
//                    recreate();
//                }else{
//                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
//                    saveNightModeState(false);
//                    recreate();
//                }
//            }
//
//        });
//        signout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                auth.signOut();
//                Intent i = new Intent (MainActivity.this,login.class);
//                startActivity(i);
//                finish();
//
//            }
//        });

        remedies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(MainActivity.this,remedies.class);
                startActivity(i);
            }
        });

        effects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(MainActivity.this,effects.class);
                startActivity(i);
            }
        });

        myth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(MainActivity.this,myth.class);
                startActivity(i);
            }
        });

        yoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(MainActivity.this,yoga.class);
                startActivity(i);
            }
        });

        rec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(MainActivity.this,recommendations.class);
                startActivity(i);
            }
        });
    }

    private void saveNightModeState(boolean nightMode) {

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(KEY_ISNIGHTMODE,nightMode);
        editor.apply();
    }

    public void checkNightModeActivated(){
        if(sharedPreferences.getBoolean(KEY_ISNIGHTMODE, false)){
            a_switch.setChecked(true);
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }else{
            a_switch.setChecked(false);
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }
}