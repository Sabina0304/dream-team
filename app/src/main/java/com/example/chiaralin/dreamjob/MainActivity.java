package com.example.chiaralin.dreamjob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    private  ToggleButton myToggleBUtton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myToggleBUtton = findViewById(R.id.toggleButton);

        myToggleBUtton.setText("Start!");

    }

    public void startButtonClick(View view) {

        Intent intent = new Intent(MainActivity.this, GenderSelectActivity.class);
        startActivity(intent);
    }


    public void newButtonClick(View view) {

    }

}
