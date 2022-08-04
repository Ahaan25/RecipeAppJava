package com.example.recipeappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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



    }
}