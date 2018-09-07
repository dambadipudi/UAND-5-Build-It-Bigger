package com.example.androidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class LibraryMainActivity extends AppCompatActivity {

    public static final String JOKE_EXTRA = "JOKE_OF_THE_DAY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lib_activity_main);

        TextView jokeTextView = findViewById(R.id.tv_joke);

        Intent intent = getIntent();
        if(intent.hasExtra(JOKE_EXTRA)) {
            jokeTextView.setText(intent.getStringExtra(JOKE_EXTRA));
        }
    }

}
