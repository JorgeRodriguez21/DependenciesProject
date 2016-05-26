package com.example.android.androidlibrary;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by negri on 23/05/2016.
 */
public class JokeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        if(getIntent().getExtras()!=null) {
            ((TextView)findViewById(R.id.jokeTV)).setText(getIntent().getStringExtra("joke"));
        }
    }
}
