package com.example.recipeappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    TextView h1, h2;
    private static int SP=1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        h1=findViewById(R.id.textView);
        h2=findViewById(R.id.textView2);

        Animation up=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slideup);
        Animation down=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slidedown);
        up.setFillAfter(true);
        down.setFillAfter(true);
        h1.startAnimation(down);
        h2.startAnimation(up);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent homeIntent=new Intent(SplashScreen.this, MainActivity.class);
                startActivity(homeIntent);
                //overridePendingTransition(R.anim.slideinright, R.anim.slideoutleft);
                finish();
            }
        }, SP);

    }
}