package com.example.tp2mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class informationAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        final TextView TVInfo;
        final Button home;
        TVInfo = (TextView) findViewById(R.id.userInfo);
        home=findViewById(R.id.BtnGoHome);

        String name = getIntent().getStringExtra("name");
        String pass = getIntent().getStringExtra("password");
        TVInfo.setText("Your name : "+name+"\nYour password : "+pass);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(informationAct.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}