package com.example.intentpassingexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnNext;
    private Intent iNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){
        btnNext = findViewById(R.id.btnNext);
        iNext = new Intent(MainActivity.this, SecondActivity.class);
        iNext.putExtra("title", "Home");
        iNext.putExtra("StudentName", "Anubhav");
        iNext.putExtra("RollNo", 10);
    }

    public void btnOnclick(View view){
        startActivity(iNext);
    }
}