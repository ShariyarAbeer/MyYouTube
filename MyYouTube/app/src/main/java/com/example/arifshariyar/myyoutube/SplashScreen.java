package com.example.arifshariyar.myyoutube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import java.util.logging.Handler;

public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        new android.os.Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent Splash = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(Splash);
                finish();
            }

        },SPLASH_TIME_OUT);
    }
}
