package com.example.teodora.myrisdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        register = (Button) findViewById(R.id.mbankID);
    }

    public void enterApp(View v)
    {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

}
