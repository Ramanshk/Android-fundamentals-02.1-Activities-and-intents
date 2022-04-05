package com.example.threebuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView article;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        article = findViewById(R.id.article_text);
        Intent intent = getIntent();
        article.setText(intent.getStringExtra(MainActivity.EXTRA_TEXT));
    }
}