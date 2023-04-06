package com.example.raadioquizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup myQ1RadioGroup;
    int score=0; public static String q1Marks="score of question 1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myQ1RadioGroup=findViewById(R.id.q1RadiogroupID);
    }

    public void Q1Function(View view) {
        if(myQ1RadioGroup.getCheckedRadioButtonId()==R.id.q1RadioBtn2ID){
            score=5;
        }
        Intent myIntent= new Intent(this,MainActivity2.class);
        myIntent.putExtra(q1Marks,score);
        startActivity(myIntent);
    }
}