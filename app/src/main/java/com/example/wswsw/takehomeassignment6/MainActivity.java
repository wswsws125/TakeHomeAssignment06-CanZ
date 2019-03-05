 package com.example.wswsw.takehomeassignment6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Tip Calculator");

        Button launchActivity = (Button) findViewById(R.id.submit_button);
        launchActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);

                //get message from 3 EditText views and 1 CheckBox
                EditText amount = (EditText) findViewById(R.id.input_amount_view);
                double amount1 = Double.parseDouble(amount.getText().toString());

                EditText taxPercentage = (EditText) findViewById(R.id.input_tax_percentage_view);
                double taxPercentage1 = Double.parseDouble(taxPercentage.getText().toString());

                EditText tipPercentage = (EditText) findViewById(R.id.input_tip_percentage_view);
                double tipPercentage1 = Double.parseDouble(tipPercentage.getText().toString());

                intent.putExtra(Keys.AMOUNT, amount1);
                intent.putExtra(Keys.TAX_PERCENTAGE, taxPercentage1);
                intent.putExtra(Keys.TIP_PERCENTAGE, tipPercentage1);


                startActivity(intent);
            }
        });
    }
}
