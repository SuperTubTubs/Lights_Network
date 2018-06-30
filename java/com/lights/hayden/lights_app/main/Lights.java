package com.lights.hayden.lights_app.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lights.hayden.lights_app.R;
import com.lights.hayden.lights_app.support.Bootloader;

public class Lights extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lights);

        new Bootloader(this);
    }
}
