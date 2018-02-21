/*
 * Copyright (C) Marina Meier, The Bachelor Degree
 */

package com.google.android.gms.samples.vision.barcodereader.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.samples.vision.barcodereader.MainActivity;
import com.google.android.gms.samples.vision.barcodereader.R;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread t = new Thread() {
            public void run() {

                try {
                    sleep(2000);

                    Intent i = new Intent(Splash.this, MainActivity.class);
                    startActivity(i);
                    finish();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }
}
