package com.example.tp2mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signInACt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        final Button btnHome;
        final Button btnSign;
        final EditText nameLog;
        final EditText passLog;
        btnHome=findViewById(R.id.btnHome);
        btnSign=findViewById(R.id.sign);
        nameLog= (EditText) findViewById(R.id.TVname);
        passLog= (EditText) findViewById(R.id.TVPass);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(signInACt.this, MainActivity.class);
                startActivity(i);
            }
        });
        btnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(signInACt.this, informationAct.class);
                String user=nameLog.getText().toString();
                String pass=passLog.getText().toString();
                i.putExtra("name",user);
                i.putExtra("password",pass);
                startActivity(i);
                finish();

            }
        });
    }
}