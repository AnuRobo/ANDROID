package com.example.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editWeight, editHeightFt, editHeightIn;
    private Button btnCalculate;
    private TextView txtResult;
    private LinearLayout llMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editWeight = findViewById(R.id.editWeight);
        editHeightFt = findViewById(R.id.editHeightFt);
        editHeightIn = findViewById(R.id.editHeightIn);
        btnCalculate = findViewById(R.id.btnCalculate);
        txtResult = findViewById(R.id.txtResult);
        llMain = findViewById(R.id.llMain);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int weight = Integer.parseInt(editWeight.getText().toString());
                int ft = Integer.parseInt(editHeightFt.getText().toString());
                int in = Integer.parseInt(editHeightIn.getText().toString());
                int totalIn = ft*12 + in;
                double totalMeter = (totalIn*2.53)/100;
                double bmi = weight/(totalMeter * totalMeter);

                if(bmi > 25){
                    txtResult.setText("OverWeight");
                    llMain.setBackgroundColor(getResources().getColor(R.color.colorOW));
                }else if(bmi<18){
                    txtResult.setText(("UnderWeight"));
                    llMain.setBackgroundColor(getResources().getColor(R.color.colorUW));
                }else{
                    txtResult.setText("Healthy");
                    llMain.setBackgroundColor(getResources().getColor(R.color.colorH));
                }

            }
        });
    }
}