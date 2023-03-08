package com.example.cab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
AppCompatButton button;
AppCompatButton button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.btn1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "You are moving to Sign In page", Toast.LENGTH_SHORT).show();

            }
        });
        button1=findViewById(R.id.btn2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "You are moving to Sign Up page", Toast.LENGTH_SHORT).show();

            }

        });
    }
}