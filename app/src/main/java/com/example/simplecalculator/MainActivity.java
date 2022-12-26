package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        resultText = findViewById(R.id.resultText);
    }

    public void sum(View view){
        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            resultText.setText("No number");
        } else {
            double n1 = Double.parseDouble(number1.getText().toString());
            double n2 = Double.parseDouble(number2.getText().toString());

            double result = n1 + n2;

            resultText.setText("Result: " + result);
        }
    }
    public void divide(View view){
        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            resultText.setText("No number");
        } else {
            double n1 = Double.parseDouble(number1.getText().toString());
            double n2 = Double.parseDouble(number2.getText().toString());

            double result = n1 / n2;

            resultText.setText("Result: " + result);
        }
    }
    public void multiply(View view){
        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            resultText.setText("No number");
        } else {
            double n1 = Double.parseDouble(number1.getText().toString());
            double n2 = Double.parseDouble(number2.getText().toString());

            double result = n1 * n2;

            resultText.setText("Result: " + result);
        }
    }
    public void substract(View view){
        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            resultText.setText("No number");
        } else {
            double n1 = Double.parseDouble(number1.getText().toString());
            double n2 = Double.parseDouble(number2.getText().toString());

            double result = n1 - n2;

            resultText.setText("Result: " + result);
        }
    }

}