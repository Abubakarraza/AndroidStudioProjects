package com.example.status_saver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
ImageView image1;
ImageView Image2;
    ImageView Image3;
    ImageView Image4;
    ImageView Image5;
    ImageView Image6;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        image1=findViewById(R.id.img1);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });

       Image2=findViewById(R.id.img2);
       Image2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity2.this,MainActivity4.class);
               startActivity(intent);
           }
       });
       Image3=findViewById(R.id.img3);
       Image3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity2.this,MainActivity5.class);
               startActivity(intent);
           }
       });
       Image4=findViewById(R.id.img4);
       Image4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent =new Intent(MainActivity2.this,MainActivity6.class);
               startActivity(intent);
           }
       });
       Image5=findViewById(R.id.img5);
       Image5.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity2.this,MainActivity7.class);
               startActivity(intent);
           }
       });
       Image6=findViewById(R.id.img6);
       Image6.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity2.this,MainActivity8.class);
               startActivity(intent);
           }
       });
    }



}