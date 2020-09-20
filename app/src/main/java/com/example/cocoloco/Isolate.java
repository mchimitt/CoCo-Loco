package com.example.cocoloco;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Isolate extends AppCompatActivity {
public String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isolate);
        String covidDate = getDate("dd/MM/yyyy", 14);
        message = "Check when your two weeks of isolation are complete: "+covidDate;
        TextView tv = findViewById(R.id.isolate_until2);
        tv.setText(message);
    }

    public void launchTestingCenterActivity(View view) {
        Intent intent = new Intent(this, TestingCenter.class);
        startActivity(intent);
    }
    public String getDate(String format, int days)
    {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        c.add(Calendar.DAY_OF_YEAR, days);
        return formatter.format(new Date(c.getTimeInMillis()));

    }

}