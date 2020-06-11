package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonConvMilesToKm = (Button)findViewById(R.id.buttonConvMilesToKm);
        buttonConvMilesToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textViewMiles = (EditText) findViewById(R.id.editTextMiles);
                EditText textViewKm = (EditText) findViewById(R.id.editTextKM);
                double vMiles = Double.parseDouble(textViewMiles.getText().toString());
                double vKm = vMiles / 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textViewKm.setText(formatVal.format(vKm));
            }
        });
        Button buttonConvKmToMiles = (Button)findViewById(R.id.buttonConvKmToMiles);
        buttonConvKmToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textViewMiles = (EditText) findViewById(R.id.editTextMiles);
                EditText textViewKm = (EditText) findViewById(R.id.editTextKM);
                double vKm = Double.parseDouble(textViewKm.getText().toString());
                double vMiles = vKm * 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textViewMiles.setText(formatVal.format(vMiles));
            }
        });
    }
}
