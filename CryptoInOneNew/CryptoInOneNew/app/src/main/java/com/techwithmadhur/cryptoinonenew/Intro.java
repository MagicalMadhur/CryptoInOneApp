package com.techwithmadhur.cryptoinonenew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }
    public void LoadPrice(View v){

        Intent intent = new Intent(this, WebActivity.class);
        startActivity(intent);
    }
    public void LoadAlert(View v){

        Intent intent = new Intent(this, setAlert.class);
        startActivity(intent);
    }
    public void LoadCalsi(View v){

        Intent intent = new Intent(this, calsi.class);
        startActivity(intent);
    }
}