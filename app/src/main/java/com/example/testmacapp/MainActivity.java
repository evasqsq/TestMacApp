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
        int d = c+5;
        int g = d*5;
        int h = g-10;
        if (h>=g){
            Log.d("MainActivity","WSWSWSWSWSW ");
        }
    }
}