package com.example.event_listner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView resulttext= (TextView)findViewById(R.id.result);
        EditText num1= (EditText) findViewById(R.id.firstnum);
        EditText num2=(EditText) findViewById(R.id.secondnum);
        AppCompatButton addbtn= (AppCompatButton) findViewById(R.id.add);
        AppCompatButton subtractbtn= (AppCompatButton) findViewById(R.id.subtract);
        AppCompatButton dividebtn= (AppCompatButton) findViewById(R.id.divide);
        AppCompatButton multiplybtn= (AppCompatButton) findViewById(R.id.multiply);
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double resultAdd = number1 + number2;
                resulttext.setText(resultAdd+ "");
            }
        });
        subtractbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double nembersub1=Double.parseDouble(num1.getText().toString());
                double nembersub2=Double.parseDouble(num2.getText().toString());
                double subtractresult=nembersub1 -nembersub2;
                resulttext.setText(subtractresult+"");
            }
        });
        dividebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numberdiv1= Double.parseDouble(num1.getText().toString());
                double numberdiv2= Double.parseDouble(num2.getText().toString());
                double divideResult = numberdiv1 / numberdiv2;
                resulttext.setText(divideResult+ "");
            }
        });
        multiplybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numbermul1 = Double.parseDouble(num1.getText().toString());
                double numbermul2 = Double.parseDouble(num2.getText().toString());
                double multiplyRes=numbermul1 * numbermul2;
                resulttext.setText(multiplyRes+"");
            }
        });

    }
}