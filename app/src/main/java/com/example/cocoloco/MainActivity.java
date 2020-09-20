package com.example.cocoloco;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchQuizActivity(View view) {
        Intent intent = new Intent(this, Quiz.class);
        startActivity(intent);
    }

    public void launchTestingCenterActivity(View view) {
        Intent intent = new Intent(this, TestingCenter.class);
        startActivity(intent);
    }

    public void launchProtocolsActivity(View view) {
        Intent intent = new Intent(this, ProtocolsStaySafe.class);
        startActivity(intent);
    }

    public void launchEssentialsActivity(View view) {
        Intent intent = new Intent(this, CovidEssentials.class);
        startActivity(intent);
    }

    public void launchWhenSick(View view) {
        Intent intent = new Intent(this, WhenSick.class);
        startActivity(intent);
    }

    public void launchFAQ(View view) {
        Intent intent = new Intent(this, FAQ.class);
        startActivity(intent);
    }

    public void launchThings(View view) {
        Intent intent = new Intent(this, ThingsToDo.class);
        startActivity(intent);
    }
}