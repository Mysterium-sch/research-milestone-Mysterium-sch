package com.example.research;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_main = (Button) findViewById(R.id.button);
        button_main.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, Game.class);
        startActivity(intent);
    }
}