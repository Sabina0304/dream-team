package com.example.chiaralin.dreamjob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

public class GenderSelectActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender_select);

        button1 = findViewById(R.id.gender1);
        button2 = findViewById(R.id.gender2);

        button1.setText("Male");
        button2.setText("Female");
    }

    public void maleClicked(View view) {
        Intent intent = new Intent(GenderSelectActivity.this, GuyFaceSelectorActivity.class);
        startActivity(intent);
    }

    public void femaleClicked(View view) {
        Intent intent = new Intent (GenderSelectActivity.this, FemaleFaceSelectorActivity.class);
        startActivity(intent);
    }


}
