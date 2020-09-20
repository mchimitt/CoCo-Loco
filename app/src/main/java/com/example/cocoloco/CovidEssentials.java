package com.example.cocoloco;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CovidEssentials extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid_essentials);
    }

    public void launchMask(View view) {
        Intent openURL = new Intent(Intent.ACTION_VIEW);
        openURL.setData(Uri.parse("https://www.amazon.com/s?k=masks&ref=nb_sb_noss_2"));
        startActivity(openURL);
    }

    public void launchSupply(View view) {
        Intent openURL = new Intent(Intent.ACTION_VIEW);
        openURL.setData(Uri.parse("https://www.wired.com/story/covid-19-gear-supplies-guide/"));
        startActivity(openURL);
    }

    public void launchSanitizer(View view) {
        Intent openURL = new Intent(Intent.ACTION_VIEW);
        openURL.setData(Uri.parse("https://www.amazon.com/s?k=hand+sanitizer&crid=2718NK1WOU0Y3&sprefix=hand+sa%2Caps%2C196&ref=nb_sb_ss_i_1_7"));
        startActivity(openURL);
    }

    public void launchGlove(View view) {
        Intent openURL = new Intent(Intent.ACTION_VIEW);
        openURL.setData(Uri.parse("https://www.amazon.com/s?k=gloves&ref=nb_sb_noss_2"));
        startActivity(openURL);
    }
}