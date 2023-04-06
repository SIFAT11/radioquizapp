package com.example.raadioquizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView outputView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        outputView=findViewById(R.id.outputTextViewID);
        Intent myGetIntent= getIntent();
        outputView.setText("You Score is "
                +myGetIntent.getIntExtra(MainActivity2.allmarks,0));
    }

    public void tryagainFunction(View view) {
        Intent myIntent= new Intent(this,MainActivity.class);
        startActivity(myIntent);
    }
}