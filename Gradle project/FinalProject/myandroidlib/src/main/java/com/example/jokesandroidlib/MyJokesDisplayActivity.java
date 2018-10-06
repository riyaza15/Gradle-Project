package com.example.jokesandroidlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MyJokesDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myjokesdisplay);

        if(savedInstanceState == null){
            Intent intent = getIntent();

            String gce_result = getIntent().getStringExtra("cloudresult");
            TextView txtJokes = (TextView) findViewById(R.id.tvjokes);
            txtJokes.setText(gce_result);
        }
    }
}
