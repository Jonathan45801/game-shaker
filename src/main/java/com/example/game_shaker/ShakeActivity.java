package com.example.game_shaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ShakeActivity extends AppCompatActivity  {
public static TextView score;

public TextView nama;
String ambilnama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shake);

        Intent intent=new Intent(this,ShakeService.class);
        startService(intent);
        score=(TextView)findViewById(R.id.score);
        nama=(TextView)findViewById(R.id.nickscore);

        nama.setText("Score: ");


        // ShakeDetector initialization

    }

}
