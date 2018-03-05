package com.example.android.takehomeassignment06_vilmariet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText amountText;
    public String amountValue;
    public EditText taxText;
    public String taxValue;
    public EditText tipText;
    public String tipValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {
        amountText = findViewById(R.id.amount_text);
        amountValue = amountText.getText().toString();

        taxText = findViewById(R.id.tax_text);
        taxValue = taxText.getText().toString();

        tipText = findViewById(R.id.tip_text);
        tipValue = tipText.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("amount", amountValue);
        intent.putExtra("tax amount", taxValue);
        intent.putExtra("tip amount", tipValue);

        startActivity(intent);

    }
}
