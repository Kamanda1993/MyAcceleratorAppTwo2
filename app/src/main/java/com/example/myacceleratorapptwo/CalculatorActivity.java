package com.example.myacceleratorapptwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
     Button mBtnAdd, mBtnSubtract, mBtnMultiply, mBtnDivide;
     TextView mTvAnswer;
     EditText mEdtFnum, mEdtSnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        //find view by ID
        mBtnAdd= findViewById(R.id.btn_Add);
        mBtnSubtract= findViewById(R.id.btn_subtract);
        mBtnMultiply= findViewById(R.id.btn_multiply);
        mBtnDivide= findViewById(R.id.btn_divide);
        mTvAnswer= findViewById(R.id.tv_answer);
        mEdtFnum= findViewById(R.id.edit_fnum);
        mEdtSnum= findViewById(R.id.edit_snumber);

        //set Onclick listener
        mBtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first_number, second_number;
                //Receive data from the user
                first_number=mEdtFnum.getText().toString().trim();
                second_number= mEdtSnum.getText().toString().trim();

                //check if the user is submitting empty fields
                if (first_number.isEmpty()) {
                    mEdtFnum.setError("please enter first number");
                }else if (second_number.isEmpty()){
                    mEdtSnum.setError("please enter second number");
                }else {
                    //proceed to compute the values and give the results on the Answer text view
                    double answer;
                    answer= Double.parseDouble(first_number) + Double.parseDouble(second_number);
                    //display the results to our text view answer
                    mTvAnswer.setText(String.valueOf((answer)));

                }

            }
        });
        mBtnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first_number, second_number;
                //Receive data from the user
                first_number=mEdtFnum.getText().toString().trim();
                second_number= mEdtSnum.getText().toString().trim();

                //check if the user is submitting empty fields
                if (first_number.isEmpty()) {
                    mEdtFnum.setError("please enter first number");
                }else if (second_number.isEmpty()){
                    mEdtSnum.setError("please enter second number");
                }else {
                    //proceed to compute the values and give the results on the Answer text view
                    double answer;
                    answer= Double.parseDouble(first_number) - Double.parseDouble(second_number);

                    //display the results to our text view answer
                    mTvAnswer.setText(String.valueOf((answer)));
                }

            }
        });
        mBtnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String first_number, second_number;
                    //Receive data from the user
                    first_number=mEdtFnum.getText().toString().trim();
                    second_number= mEdtSnum.getText().toString().trim();

                    //check if the user is submitting empty fields
                    if (first_number.isEmpty()) {
                        mEdtFnum.setError("please enter first number");
                    }else if (second_number.isEmpty()){
                        mEdtSnum.setError("please enter second number");
                    }else {
                        //proceed to compute the values and give the results on the Answer text view
                        double answer;
                        answer= Double.parseDouble(first_number) * Double.parseDouble(second_number);
                        //display the results to our text view answer
                        mTvAnswer.setText(String.valueOf((answer)));
                    }

            }
        });
        mBtnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first_number, second_number;
                //Receive data from the user
                first_number=mEdtFnum.getText().toString().trim();
                second_number= mEdtSnum.getText().toString().trim();

                //check if the user is submitting empty fields
                if (first_number.isEmpty()) {
                    mEdtFnum.setError("please enter first number");
                }else if (second_number.isEmpty()){
                    mEdtSnum.setError("please enter second number");
                }else {
                    //proceed to compute the values and give the results on the Answer text view
                    Double answer;
                    answer= Double.parseDouble(first_number) / Double.parseDouble(second_number);
                    //display the results to our text view answer
                    mTvAnswer.setText(String.valueOf((answer)));
            }

            }
        });


    }
}