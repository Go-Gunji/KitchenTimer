package com.example.kitchentimer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
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

        CountDownTimer timer = new CountDownTimer(3*60*1000, 100) {
            // 指定した間隔で実行したい処理
            @Override
            public void onTick(long millisUntilFinished) {
                long minute = millisUntilFinished / 1000 / 60;
                long second = millisUntilFinished / 1000 % 60;

                mTimerText.setText(String.format("%1$d:%2$02d", minute, second));
            }

            // タイマー終了時の処理
            @Override
            public void onFinish() {
                mTimerText.setText("0:00");
            }
        };

        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer.start();
            }
        });

        mStopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer.cancel();
            }
        });
    }
}