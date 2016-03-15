package com.example.laptop.touchmenot;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rlCharger, rlMotion, rlSim, rlSettings;
    public static boolean active = false;
    int state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rlSettings = (RelativeLayout) findViewById(R.id.rlSettings);
        rlCharger = (RelativeLayout) findViewById(R.id.rlCharger);
        rlMotion = (RelativeLayout) findViewById(R.id.rlMotion);
        rlSim = (RelativeLayout) findViewById(R.id.rlSimCard);

        rlSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(getBaseContext(), SnatchedSettingsActivity.class);
                startActivity(i);
            }
        });

        rlCharger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(getBaseContext(), ChargerDetectionActivity.class);
                i.putExtra("active", active);
                startActivity(i);
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}
