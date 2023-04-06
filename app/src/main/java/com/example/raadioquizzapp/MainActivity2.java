package com.example.raadioquizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class MainActivity2 extends AppCompatActivity {
    RadioGroup myQ2RadioGroup;
    int tempScore,totalScore;
    public  static  String allmarks="all marks";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent myGetIntent= getIntent();
        tempScore=myGetIntent.getIntExtra(MainActivity.q1Marks,0);
        myQ2RadioGroup=findViewById(R.id.q2RadiogroupID);
}

    public void Q2Function(View view) {
            if (myQ2RadioGroup.getCheckedRadioButtonId()==R.id.q2RadioBtn3ID){
                totalScore=tempScore+5;
            }
            else{
                totalScore=tempScore;
            }
            Intent myIntent= new Intent(this,MainActivity3.class);
            myIntent.putExtra(allmarks,totalScore);
            startActivity(myIntent);
        }

        public void preFucntion(View view) {
            Intent myIntent= new Intent(this,MainActivity.class);
            startActivity(myIntent);
    }
}