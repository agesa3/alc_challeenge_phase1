package com.agesa.alc_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button about_alc;
    Button my_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        about_alc=findViewById(R.id.about_alc);
        my_profile=findViewById(R.id.profile);
    }

    @Override
    protected void onStart() {
        super.onStart();
        about_alc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abt=new Intent(MainActivity.this,aboutPage.class);
                startActivity(abt);
            }
        });

        my_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about=new Intent(MainActivity.this,myProfile.class);
                startActivity(about);
            }
        });
    }
}
