package com.example.chiaralin.dreamjob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FemaleFaceSelectorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_female_face_selector);
    }

    public void selectWhiteGirlFace(View view){
        Intent intent = new Intent(FemaleFaceSelectorActivity.this, WhiteGirlFullBodyActivity.class);
        startActivity(intent);
    }
}
