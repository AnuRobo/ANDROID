package com.example.animationexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button btnRotate, btnAlpha, btnScale, btnTranslate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){
        textView = findViewById(R.id.textView);

        btnTranslate = findViewById(R.id.btnTranslate);
        btnRotate = findViewById(R.id.btnRotate);
        btnAlpha = findViewById(R.id.btnAlpha);
        btnScale = findViewById(R.id.btnScale);
    }

    public void translate(View view){
        Animation translate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        textView.startAnimation(translate);
    }

    public void rotate(View view){
        Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotation);
        textView.startAnimation(rotate);
    }

    public void scale(View view){
        Animation scale = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
        textView.startAnimation(scale);
    }

    public void alpha(View view){
        Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
        textView.startAnimation(alpha);
    }
}
