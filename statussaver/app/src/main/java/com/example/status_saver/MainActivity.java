package com.example.status_saver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.view.View;

public class MainActivity extends AppCompatActivity {
AppCompatButton button1;
AppCompatButton button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
       startActivity(intent);
            }
        });
        button2=findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
            }
        });
    }
}