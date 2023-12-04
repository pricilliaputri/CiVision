package com.example.cvisionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView imgDefinsi = (ImageView) findViewById((R.id.imgDefinisi));
        ImageView imgGejala = (ImageView) findViewById((R.id.imgGejala));
        ImageView imgCamera = (ImageView) findViewById((R.id.imgCamera));
        ImageView imgPencegahan = (ImageView) findViewById((R.id.imgPencegahan));


        imgGejala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, Gejala.class);
                startActivity(intent);
            }
        });

        imgCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });



        imgDefinsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, Definisi.class);
                startActivity(intent);
            }

        });
        imgPencegahan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, Pencegahan.class);
                startActivity(intent);
            }
        });
    }
}