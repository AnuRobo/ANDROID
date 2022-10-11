package com.example.intentpassingexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textSecond;
    private Intent fromAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        init();

        String title = fromAct.getStringExtra("title");
        String studentName = fromAct.getStringExtra("StudentName");
        int rollNo = fromAct.getIntExtra("RollNo", 0);

        textSecond.setText("Title :" + title + ", " + "Name :" + studentName + ", " + "Roll No. :" + rollNo);
    }

    protected void init(){
        textSecond = findViewById(R.id.textSecond);
        fromAct = getIntent();
    }
}