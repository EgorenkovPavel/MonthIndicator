package com.example.monthindicator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Indicator indicator = findViewById(R.id.indicator);

        indicator.setMin(1);
        indicator.setMax(31);
        indicator.setValue(18);

        indicator.setCashflow(1000);
        indicator.setBudget(2000);

        indicator.addDot(2);
        indicator.addDot(9);
        indicator.addDot(16);
        indicator.addDot(23);
        indicator.addDot(30);
    }
}
