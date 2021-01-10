package com.example.p2papplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.p2papplication.activities.Chess;
import com.example.p2papplication.activities.Home;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(MainActivity.this, Home.class);
        startActivity(intent);
//        finish();
//        System.exit(0);
    }

}