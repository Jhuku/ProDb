package com.example.shuvamghosh.prodb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import processing.android.PFragment;
import processing.core.PApplet;


import processing.android.PFragment;
import processing.android.CompatUtils;
import processing.core.PApplet;

public class PlotActivity extends AppCompatActivity {

    private PApplet sketch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plot);
        FrameLayout frameLayout = findViewById(R.id.container);



        sketch = new Sketch();
        PFragment fragment = new PFragment();
        fragment.setSketch(sketch);

       fragment.setView





    }
}
