package com.lights.hayden.lights_app.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lights.hayden.lights_app.R;
import com.lights.hayden.lights_app.support.Bootloader;
import com.lights.hayden.lights_app.ui.AddLightConfigDialog;

public class Lights extends AppCompatActivity implements AddLightConfigDialog.AdjacencyPairListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lights);

        new Bootloader(this);
    }
}
