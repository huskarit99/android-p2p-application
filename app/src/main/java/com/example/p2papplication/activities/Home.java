package com.example.p2papplication.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.p2papplication.R;

public class Home extends AppCompatActivity {
    TextView tvPlay, tvScan, tvProfile, tvFriends, tvQuit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configActionBarAndNavigationBar();
        setContentView(R.layout.activity_home);
        mapping();

        tvPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Chess.class);
                startActivity(intent);
            }
        }); 

        tvScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, ScanPlayers.class);
                startActivity(intent);
            }
        });

        tvQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }

    private void configActionBarAndNavigationBar() {
        getSupportActionBar().hide();
        View decorView = getWindow().getDecorView();
        final int flags = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE;
        decorView.setSystemUiVisibility(flags);
        getWindow().setStatusBarColor(getResources().getColor(R.color.backgroundBoard));
    }


    @Override
    protected void onResume() {
        super.onResume();
        configActionBarAndNavigationBar();
    }

    @Override
    protected void onPause() {
        super.onPause();
        configActionBarAndNavigationBar();
    }

    private void mapping() {
        tvFriends = findViewById(R.id.tvFriends);
        tvScan = findViewById(R.id.tvScan);
        tvPlay = findViewById(R.id.tvPlay);
        tvProfile = findViewById(R.id.tvProfile);
        tvQuit = findViewById(R.id.tvQuit);
    }
}
