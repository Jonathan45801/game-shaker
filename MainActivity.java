package com.example.game_shaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
public EditText username;
public Button login;
    public static final String Username = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.username);
        login=(Button)findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String nama=username.getText().toString();
                Intent intent=new Intent(MainActivity.this,loginActivity.class);
                intent.putExtra(Username,nama);
                startActivity(intent);

            }
        });
    }
}
