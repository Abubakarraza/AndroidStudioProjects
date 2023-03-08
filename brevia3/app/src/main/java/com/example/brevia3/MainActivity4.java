package com.example.brevia3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
TextView hlww2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        hlww2=findViewById(R.id.hlww);
        hlww2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(intent);

            }
        });
    }
}