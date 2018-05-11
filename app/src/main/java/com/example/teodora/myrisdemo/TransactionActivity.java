package com.example.teodora.myrisdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TransactionActivity extends AppCompatActivity {

    private Button authenticate;
    private EditText date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);

        authenticate = (Button) findViewById(R.id.authID);
        date = (EditText)findViewById(R.id.dateID);

        SimpleDateFormat sdf = new SimpleDateFormat( "yyyy/MM/dd" );
        date.setText( sdf.format( new Date() ));
    }

    public void authenticateIris(View v)
    {
        Intent intent = new Intent(TransactionActivity.this, AuthenticateActivity.class);
        startActivity(intent);
    }
}
