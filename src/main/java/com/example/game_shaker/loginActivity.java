package com.example.game_shaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {
public TextView namashow,nama;
String ambilnama;
public Button main;
    private SensorManager mSensorManager;
    private Sensor mAccelerometer;
    private ShakeDetector mShakeDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        namashow = (TextView) findViewById(R.id.textView);
        main = (Button) findViewById(R.id.Shake);
        Intent intent = getIntent();
        ambilnama = intent.getStringExtra(MainActivity.Username);
        namashow.setText("Selamat Datang: " + ambilnama);
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loginActivity.this, ShakeActivity.class);
                startActivity(intent);
            }
        });
    }
}
