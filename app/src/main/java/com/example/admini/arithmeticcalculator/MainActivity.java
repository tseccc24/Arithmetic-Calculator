package com.example.admini.arithmeticcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button plusBtn;
    private Button minusbtn;
    private Button multiplyBtn;
    private Button divideBtn;
    private EditText input1;
    private EditText input2;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plusBtn = findViewById(R.id.plusBtn);
        minusbtn = findViewById(R.id.minusBtn);
        multiplyBtn = findViewById(R.id.multiplyBtn);
        divideBtn = findViewById(R.id.divideBtn);
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        result = findViewById(R.id.resultTextView);

        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(input1.getText().toString());
                int b = Integer.parseInt(input2.getText().toString());
                result.setText((a+b+""));
            }
        });

        minusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(input1.getText().toString());
                int b = Integer.parseInt(input2.getText().toString());
                result.setText((a-b+""));
            }
        });

        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(input1.getText().toString());
                int b = Integer.parseInt(input2.getText().toString());

                result.setText(((a*b)+""));
            }
        });

        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(input1.getText().toString());
                int b = Integer.parseInt(input2.getText().toString());
                if(b==0){
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                }else
                result.setText(((a/b)+""));
            }
        });
    }

}
