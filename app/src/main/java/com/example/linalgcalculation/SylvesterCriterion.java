package com.example.linalgcalculation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SylvesterCriterion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylvester_criterion);

        Button SylvesterCriterionBtn = (Button)findViewById(R.id.SylvesterCriterionBtn);
        SylvesterCriterionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextNumber1 = (EditText)findViewById(R.id.editTextNumberA1);
                EditText editTextNumber2 = (EditText)findViewById(R.id.editTextNumberA2);
                EditText editTextNumber3 = (EditText)findViewById(R.id.editTextNumberA3);
                EditText editTextNumber4 = (EditText)findViewById(R.id.editTextNumberA4);
                EditText editTextNumber5 = (EditText)findViewById(R.id.editTextNumberA5);
                EditText editTextNumber6 = (EditText)findViewById(R.id.editTextNumberA6);
                EditText editTextNumber7 = (EditText)findViewById(R.id.editTextNumberA7);
                EditText editTextNumber8 = (EditText)findViewById(R.id.editTextNumberA8);
                EditText editTextNumber9 = (EditText)findViewById(R.id.editTextNumberA9);
                TextView resultTextView = (TextView)findViewById(R.id.resultTextView);

                int[][] m = new int[3][3];
                m[0][0] = Integer.parseInt(editTextNumber1.getText().toString());
                m[0][1] = Integer.parseInt(editTextNumber2.getText().toString());
                m[0][2] = Integer.parseInt(editTextNumber3.getText().toString());
                m[1][0] = Integer.parseInt(editTextNumber4.getText().toString());
                m[1][1] = Integer.parseInt(editTextNumber5.getText().toString());
                m[1][2] = Integer.parseInt(editTextNumber6.getText().toString());
                m[2][0] = Integer.parseInt(editTextNumber7.getText().toString());
                m[2][1] = Integer.parseInt(editTextNumber8.getText().toString());
                m[2][2] = Integer.parseInt(editTextNumber9.getText().toString());

                boolean firstMinor, secondMinor, thirdMinor;
                String result;
                firstMinor = m[0][0] > 0;
                secondMinor = (m[0][0]*m[1][1] - m[0][1]*m[1][0]) > 0;
                thirdMinor = (m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1]) -
                              m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0]) +
                              m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0])) > 0;
                if (firstMinor && secondMinor && thirdMinor) {
                    result = "Positive definite";
                } else if (!firstMinor && secondMinor && !thirdMinor) {
                    result = "Negative definite";
                } else {
                    result = "Alternating definite";
                }
                resultTextView.setText(result);
            }
        });
    }

}