package com.example.recipeappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CheckCuisines extends AppCompatActivity {

    ImageView american, chinese, indian, italian, japanese, mexican;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_cuisines);

        american=findViewById(R.id.imageView4);
        chinese=findViewById(R.id.imageView3);
        indian=findViewById(R.id.imageView5);
        italian=findViewById(R.id.imageView6);
        japanese=findViewById(R.id.imageView7);
        mexican=findViewById(R.id.imageView8);

        american.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CheckCuisines.this, AmericanCuisine.class);
                startActivity(i);
            }
        });

        chinese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CheckCuisines.this, ChineseCuisine.class);
                startActivity(i);
            }
        });

        indian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CheckCuisines.this, IndianCuisine.class);
                startActivity(i);
            }
        });

        italian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CheckCuisines.this, ItalianCuisine.class);
                startActivity(i);
            }
        });

        japanese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CheckCuisines.this, JapaneseCuisine.class);
                startActivity(i);
            }
        });

        mexican.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CheckCuisines.this, MexicanCuisine.class);
                startActivity(i);
            }
        });

    }
}