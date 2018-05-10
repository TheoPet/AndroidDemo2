package com.example.teodora.myrisdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class TransactionActivity extends AppCompatActivity {

    private Button payButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);

        payButton = (Button) findViewById(R.id.payBtnID);
    }

    public void pay(View v)
    {
        Intent intent = new Intent(TransactionActivity.this, AuthenticateActivity.class);
        startActivity(intent);
    }
}
