package com.example.teodora.myrisdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private Button login;
    private EditText pinNum;
    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button) findViewById(R.id.loginID);

        pinNum = (EditText) findViewById(R.id.pinID);
       // info = (TextView)findViewById(R.id.textViewID);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(pinNum.getText().toString());
            }
        });
    }

    public void validate(String pinNum)
    {
        if(!pinNum.equals("1234"))
            login.setEnabled(false);
        else
        {
            Intent intent = new Intent(LoginActivity.this, TransactionCompleteActivity.class);
            startActivity(intent);
        }

    }

}
