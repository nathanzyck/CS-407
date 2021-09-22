package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity2(String result) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message",result);
        startActivity(intent);
    }

    public void addition(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        String int1 = myTextField1.getText().toString();

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        String int2 = myTextField2.getText().toString();

        Integer result = Integer.parseInt(int1) + Integer.parseInt(int2);
        String calc = result.toString();
        goToActivity2(calc);
    }

    public void subtraction(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        String int1 = myTextField1.getText().toString();

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        String int2 = myTextField2.getText().toString();

        Integer result = Integer.parseInt(int1) - Integer.parseInt(int2);
        String calc = result.toString();
        goToActivity2(calc);
    }

    public void multiplication(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        String int1 = myTextField1.getText().toString();

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        String int2 = myTextField2.getText().toString();

        Integer result = Integer.parseInt(int1) * Integer.parseInt(int2);
        String calc = result.toString();
        goToActivity2(calc);
    }

    public void division(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        String int1 = myTextField1.getText().toString();

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        String int2 = myTextField2.getText().toString();

        Integer result = Integer.parseInt(int1) / Integer.parseInt(int2);
        String calc = result.toString();
        goToActivity2(calc);
    }
}