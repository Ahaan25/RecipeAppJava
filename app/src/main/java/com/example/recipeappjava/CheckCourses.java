package com.example.recipeappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CheckCourses extends AppCompatActivity {

    TextView appetizer, maincourse, dessert, palletecleanser;
    ImageView app, mai, des, pal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_courses);

        appetizer=findViewById(R.id.textView6);
        maincourse=findViewById(R.id.textView7);
        dessert=findViewById(R.id.textView8);
        palletecleanser=findViewById(R.id.textView9);
        app=findViewById(R.id.imageView9);
        mai=findViewById(R.id.imageView10);
        des=findViewById(R.id.imageView11);
        pal=findViewById(R.id.imageView12);

        appetizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(CheckCourses.this, Appetizer.class);
            }
        });
        app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(CheckCourses.this, Appetizer.class);
            }
        });

        maincourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(CheckCourses.this, MainCourse.class);
            }
        });
        mai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(CheckCourses.this, MainCourse.class);
            }
        });

        dessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(CheckCourses.this, Desserts.class);
            }
        });
        des.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(CheckCourses.this, Desserts.class);
            }
        });

        palletecleanser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(CheckCourses.this, PaleteCleansers.class);
            }
        });
        pal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(CheckCourses.this, PaleteCleansers.class);
            }
        });

    }
}