package com.example.cab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
TextView text;
AppCompatButton but;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        text=findViewById(R.id.txt);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        but=findViewById(R.id.btn4);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity3.this, "This is not available yet", Toast.LENGTH_SHORT).show();
            }
        });
    }
}