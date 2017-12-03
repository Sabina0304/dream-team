package com.example.chiaralin.dreamjob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GuyFaceSelectorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guy_face_selector);
    }

    public void selectWhiteFace(View view){
        Intent intent = new Intent(GuyFaceSelectorActivity.this, WhiteGuyFullBodyActivity.class);
        startActivity(intent);
    }

    public void selectBlackFace(View view) {
        Intent intent = new Intent(GuyFaceSelectorActivity.this, BlackGuyFullBodyActivity.class);
        startActivity(intent);
    }
}
