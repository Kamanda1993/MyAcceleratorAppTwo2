package com.example.myacceleratorapptwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //declare your Interface elements and variables

    Button mBtnCalc, mBtnIntents, mBtnWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find view by Id to your declared elements
        mBtnCalc= findViewById(R.id.btn_Calc);
        mBtnIntents=findViewById(R.id.btn_Intents);
        mBtnWeb= findViewById(R.id.btn_Web);

        //set OnClick listeners to the declared buttons
        mBtnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //first method
              //Intent go_to_calc_page= new Intent(MainActivity.this,CalculatorActivty.class);
               //startActivity(go_to_calc_page);

                //second method
                startActivity(new Intent(MainActivity.this,CalculatorActivity.class));
            }
        });
        mBtnIntents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,IntentsActivity.class));
            }
        });
        mBtnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,WebActivity.class));
            }
        });
    }
}