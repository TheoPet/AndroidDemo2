package com.example.teodora.myrisdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View;

public class TransactionCompleteActivity extends AppCompatActivity {

  //  private Button homeBtn;
    private ImageButton transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_complete);

       // homeBtn = (Button)findViewById(R.id.completeBtnID);
        transaction = (ImageButton) findViewById(R.id.imageButton2);
    }

    public void payments (View v)
    {
        Intent intent = new Intent(this, TransactionActivity.class);
        startActivity(intent);
    }
}
