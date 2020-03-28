package com.emredogan.jenkinsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Test to trigger Jenkins");


    }

    public static int additions(int a, int b) {
        return a + b;
    }
}
