package com.example.wswsw.takehomeassignment6;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //get the intent and extras
        Intent intent1 = getIntent();
        Bundle extras = intent1.getExtras();

        //get the double amount, tax percentage, tip percentage passed by the main activity

        double amount =extras.getDouble(Keys.AMOUNT);
        double taxPercentage = extras.getDouble(Keys.TAX_PERCENTAGE);
        double tipPercentage = extras.getDouble(Keys.TIP_PERCENTAGE);
        double tax=amount*taxPercentage;
        double tip=amount*tipPercentage;

        //turn the object into string
        String allInfo="Total: "+amount+
                "\nSales Tax: "+tax
                +"\nTip: "+tip
                +"\nGrand Total: "+(amount+tax+tip);


        setTitle("Your Receipt");

        TextView textView1 = (TextView)findViewById(R.id.message_view2);
        textView1.setText(allInfo);
    }

}
