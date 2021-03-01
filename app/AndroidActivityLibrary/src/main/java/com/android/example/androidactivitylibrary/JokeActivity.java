package com.android.example.androidactivitylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    private TextView mJokeTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        mJokeTextView = findViewById(R.id.tv_joke);
        Intent intent = getIntent();
        if (intent != null) {
            if (intent.hasExtra("jokeString")) {
                String myStr = intent.getStringExtra("jokeString");
                mJokeTextView.setText(myStr);
            }
        }

    }
}