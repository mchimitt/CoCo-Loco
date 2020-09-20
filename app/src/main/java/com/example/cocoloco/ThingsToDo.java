package com.example.cocoloco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ThingsToDo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);
    }

    public void launchAtHome(View view) {
        Intent intent = new Intent(this, ThingsAtHome.class);
        startActivity(intent);
    }

    public void launchBake(View view) {
        Intent intent = new Intent(this, ThingsToBake.class);
        startActivity(intent);
    }

    public void launchParks(View view) {
        Uri addressUri = Uri.parse("geo:0,0?q=local parks");
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
        startActivity(intent);
    }

    public void launchTrails(View view) {
        Uri addressUri = Uri.parse("geo:0,0?q=local trails");
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
        startActivity(intent);
    }

    public void launchRestaurants(View view) {
        Uri addressUri = Uri.parse("geo:0,0?q=Restaurants");
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
        startActivity(intent);
    }
}