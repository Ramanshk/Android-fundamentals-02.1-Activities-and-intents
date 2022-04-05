package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView countDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        countDisplay = findViewById(R.id.countDisplay);
        Intent intent = getIntent();
        countDisplay.setText(intent.getStringExtra(MainActivity.EXTRA_TEXT));
    }
}