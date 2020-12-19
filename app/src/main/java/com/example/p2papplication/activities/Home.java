package com.example.p2papplication.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.p2papplication.R;

public class Home extends AppCompatActivity {
    LinearLayout llPlay, llScan, llProfile, llFriends, llQuit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_home);
        mapping();

        llPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Chess.class);
                startActivity(intent);
            }
        });

        llScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, ScanPlayers.class);
                startActivity(intent);
            }
        });

        llQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }

    private void mapping() {
        llFriends = findViewById(R.id.llFriends);
        llScan = findViewById(R.id.llScan);
        llPlay = findViewById(R.id.llPlay);
        llProfile = findViewById(R.id.llProfile);
        llQuit = findViewById(R.id.llQuit);
    }
}
