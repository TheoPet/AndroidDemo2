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
    private EditText userName;
    private EditText password;
    private TextView info;

    private int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button) findViewById(R.id.logBtnID);

        userName = (EditText) findViewById(R.id.userNameID);
        password = (EditText) findViewById(R.id.passID);
        info = (TextView)findViewById(R.id.textViewID);

        info.setText("Number of remaining login attempts: 3");
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(userName.getText().toString(),password.getText().toString());
            }
        });
    }

    private void validate (String _userName, String _password)
    {
        if((_userName.equals("Nikola")) && (_password.equals("Basta")))
        {
            Intent intent = new Intent(LoginActivity.this,TransactionActivity.class);
            startActivity(intent);
        }else
        {
            counter--;
            info.setText("Number of remaining login attempts: " + String.valueOf(counter));
            if(counter == 0)
                login.setEnabled(false);
        }
    }
}
