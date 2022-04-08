package com.example.health_fitness_tracker;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.SeekBar;


public class Thermometer extends AppCompatActivity {

    private android.widget.SeekBar sbTemp;
    private com.xcz1899.thermometerlib.Thermometer thermometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thermometer);
        this.thermometer = (com.xcz1899.thermometerlib.Thermometer) findViewById(R.id.thermometer);

        this.sbTemp = (SeekBar) findViewById(R.id.sb_Temp);


        sbTemp.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                thermometer.setCurrentTemp(i-30);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
