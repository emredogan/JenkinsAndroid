package com.emredogan.jenkinsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Test to trigger Jenkins 10");


    }

    public static int additions(int a, int b) {
        return a + b;
    }
}
