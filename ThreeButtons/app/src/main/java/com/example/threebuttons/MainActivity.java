package com.example.threebuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT = "com.example.ThreeButtons.extra.TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        switch (view.getId()){
            case R.id.button1:
                intent.putExtra(EXTRA_TEXT, getString(R.string.article_one));
                startActivity(intent);
                break;

            case R.id.button2:
                intent.putExtra(EXTRA_TEXT, getString(R.string.article_two));
                startActivity(intent);
                break;

            case R.id.button3:
                intent.putExtra(EXTRA_TEXT, getString(R.string.article_three));
                startActivity(intent);
                break;
        }
    }
}