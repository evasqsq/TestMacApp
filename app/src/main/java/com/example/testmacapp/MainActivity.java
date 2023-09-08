package com.example.testmacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int a = 5;
        int b = 10;
        int c = Integer.parseInt(String.valueOf(a+b));
        Log.d("MainActivity", String.valueOf(c));
        Log.d("MainActivity","My Second commit");

    }
}