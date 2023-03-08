package com.example.event_listner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView txt2 = (TextView)findViewById(R.id.text2);
        EditText edit2 = (EditText) findViewById(R.id.edittext2);
        AppCompatButton btn2 = (AppCompatButton) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double amount2 = Double.parseDouble(edit2.getText().toString());
                amount2 /=180;
                txt2.setText(amount2 + "");
            }
        });
    }
}