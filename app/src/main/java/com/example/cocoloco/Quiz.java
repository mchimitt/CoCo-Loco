package com.example.cocoloco;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    public void answerPage(View view) {
        CheckBox[] getTested = new CheckBox[6];
        CheckBox[] isolate = new CheckBox[6];
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        CheckBox checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        CheckBox checkBox6 = (CheckBox) findViewById(R.id.checkBox6);
        CheckBox checkBox7 = (CheckBox) findViewById(R.id.checkBox7);
        CheckBox checkBox8 = (CheckBox) findViewById(R.id.checkBox8);
        CheckBox checkBox9 = (CheckBox) findViewById(R.id.checkBox9);
        CheckBox checkBox10 = (CheckBox) findViewById(R.id.checkBox10);
        CheckBox checkBox11 = (CheckBox) findViewById(R.id.checkBox11);
        CheckBox checkBox12 = (CheckBox) findViewById(R.id.checkBox12);
        if (checkBox1.isChecked() || checkBox3.isChecked() || checkBox7.isChecked() || checkBox8.isChecked() || checkBox9.isChecked() || checkBox12.isChecked()) {
            //1, 3, 7, 8, 9, 12 - DEFINITELY get tested
            Intent intent = new Intent(this, GetTested.class);
            startActivity(intent);
        } else if(checkBox2.isChecked() || checkBox4.isChecked() || checkBox5.isChecked() || checkBox6.isChecked() || checkBox8.isChecked() || checkBox10.isChecked() || checkBox11.isChecked()) {
            Intent intent = new Intent(this, Isolate.class);
            startActivity(intent);
        }
        else{
            Intent intent = new Intent(this, Safe.class);
            startActivity(intent);
        }
    }
}