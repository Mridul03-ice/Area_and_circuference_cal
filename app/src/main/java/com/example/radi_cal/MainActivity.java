package com.example.radi_cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public double Area;
    public double Circum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Show(View v){
        EditText editTextNumber = findViewById(R.id.editTextNumber); // get reference to the number field
        Double userInput = Double.parseDouble(editTextNumber.getText().toString());
        Area=(3.1416)*(userInput*userInput);
        Circum=2*(3.1416)* userInput;
        Toast.makeText(this, "The Area is : " + Double.toString(this.Area), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "The Circumference is : " + Double.toString(this.Circum), Toast.LENGTH_SHORT).show();
    }
}