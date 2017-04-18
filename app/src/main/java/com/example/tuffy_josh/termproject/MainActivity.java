package com.example.tuffy_josh.termproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void scheduleBuilderClicked(View v){
        Intent i1 = new Intent(this,builder.class);
        startActivity(i1);
    }

    public void classListClicked(View v){
        Intent i2 = new Intent(this, webviewclasses.class);
        startActivity(i2);
    }
}
