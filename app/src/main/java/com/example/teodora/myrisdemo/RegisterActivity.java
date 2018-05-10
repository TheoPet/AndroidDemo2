package com.example.teodora.myrisdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class RegisterActivity extends Activity {

    private Button scanIrisButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        scanIrisButton = (Button) findViewById(R.id.regBtnID);
    }

    public void scanIris(View v )
    {
        Intent intent = new Intent(RegisterActivity.this, TransactionActivity.class);
        startActivity(intent);
    }
}
