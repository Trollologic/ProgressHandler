package com.trollologic.progresshandler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.trollologic.progresshandlerlib.ProgressAppCompactActivity;

public class MainActivity extends ProgressAppCompactActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
