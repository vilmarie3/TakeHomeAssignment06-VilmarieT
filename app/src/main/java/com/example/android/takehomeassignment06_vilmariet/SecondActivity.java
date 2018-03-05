package com.example.android.takehomeassignment06_vilmariet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

        public double totalAmount;
        public double salesTaxAmount;
        public double tipAmount;
        public double grandTotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        TextView receipt = findViewById(R.id.receiptText);
        Intent intent = getIntent();

        String amountValue = intent.getExtras().getString("amount");
        totalAmount = Double.parseDouble(amountValue);


        String taxValue = intent.getExtras().getString("tax amount");
        salesTaxAmount = Double.parseDouble(taxValue) * totalAmount;

        String tipValue = intent.getExtras().getString("tip amount");
        tipAmount = Double.parseDouble(tipValue) * totalAmount;

        grandTotal = totalAmount + salesTaxAmount + tipAmount;

        receipt.setText("Total: $" + totalAmount + "\nSales Tax: $" + salesTaxAmount + "\nTip: $" + tipAmount + "\nGrand Total: $" + grandTotal);



    }
}
