package com.example.recipeappjava;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView cuisine, courses;
    TextView reviews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reviews=findViewById(R.id.textView5);
        reviews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, ReadReviews.class);
                startActivity(i);
            }
        });


        courses=findViewById(R.id.imageView2);
        courses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CheckCourses.class);
                startActivity(i);
            }
        });


        cuisine=findViewById(R.id.imageView);
        cuisine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CheckCuisines.class);
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.mainmenu,menu);
        return true;
    }

    /*
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Intent i=new Intent(MainActivity.this, AddRecords.class);
                startActivity(i);
                return true;
            case R.id.item2:
                Intent a=new Intent(MainActivity.this, EditRecords.class);
                startActivity(a);
                return true;
            case R.id.item3:
                Intent ib=new Intent(MainActivity.this, DeleteRecords.class);
                startActivity(ib);
                return true;
            case R.id.item4:
                Intent ia=new Intent(MainActivity.this, ViewRecords.class);
                startActivity(ia);
                return true;
            default:return super.onOptionsItemSelected(item);
        }
    }
    */

}