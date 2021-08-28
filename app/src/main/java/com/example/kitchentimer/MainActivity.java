package com.example.kitchentimer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTimerText;
    ImageView mStartButton;
    ImageView mStopButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTimerText = (TextView) findViewById(R.id.timerText);
        mStartButton = (ImageView) findViewById(R.id.timerStart);
        mStopButton = (ImageView) findViewById(R.id.timerStop);
    }
}