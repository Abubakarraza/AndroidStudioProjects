package com.example.brevia3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
AppCompatButton button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button3=findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity3.this, "This is not available yet", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(intent);
            }
        });
    }


}