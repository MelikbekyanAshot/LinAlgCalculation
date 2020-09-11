package com.example.linalgcalculation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sumButton = (Button) findViewById(R.id.SumMatrix);
        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), Sum.class);
                startActivity(startIntent);
            }
        });

        Button sylvesterCriterion = (Button) findViewById(R.id.SylvesterCriterion);
        sylvesterCriterion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), SylvesterCriterion.class);
                startActivity(startIntent);
            }
        });
    }
}