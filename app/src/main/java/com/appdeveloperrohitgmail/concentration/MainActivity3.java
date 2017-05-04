package com.appdeveloperrohitgmail.concentration;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
MediaPlayer a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
a=MediaPlayer.create(this, R.raw.ghost1);
        a.start();
    }
}
