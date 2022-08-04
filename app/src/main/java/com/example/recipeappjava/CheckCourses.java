package com.example.recipeappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CheckCourses extends AppCompatActivity {

    TextView appetizer, maincourse, dessert, palletecleanser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_courses);

        appetizer=findViewById(R.id.textView6);
        maincourse=findViewById(R.id.textView7);
        dessert=findViewById(R.id.textView8);
        palletecleanser=findViewById(R.id.textView9);



    }
}