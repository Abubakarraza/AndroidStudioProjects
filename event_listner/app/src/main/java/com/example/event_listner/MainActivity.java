package com.example.event_listner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Console;

public class MainActivity extends AppCompatActivity {
    AppCompatButton btnnConverter;
    AppCompatButton btnCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt = (TextView) findViewById(R.id.text);
        AppCompatButton btn = (AppCompatButton) findViewById(R.id.btn);
        EditText edit = (EditText) findViewById(R.id.edittext);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double amount=Double.parseDouble(edit.getText().toString());
                amount *=180;
                txt.setText(amount+"");

            }
        });

       btnnConverter=findViewById(R.id.btnconverter);
       btnnConverter.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this,MainActivity2.class);
               startActivity(intent);
           }
       });
       btnCalculator=findViewById(R.id.claculator);
       btnCalculator.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent =new Intent(MainActivity.this,MainActivity3.class);
               startActivity(intent);
           }
       });

    }
}