package com.example.lesson1_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvLogin = findViewById(R.id.tv_second);

        String login = getIntent().getStringExtra("login");
        tvLogin.setText(login);
    }
}