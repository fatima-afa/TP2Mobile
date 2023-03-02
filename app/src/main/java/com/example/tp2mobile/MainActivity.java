package com.example.tp2mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final EditText nameLog;
       final EditText passLog;
        Button btLog;
        Button btnSign;
        btLog=findViewById(R.id.idLogin);
        btnSign = findViewById(R.id.IdSignIn);
        nameLog= (EditText) findViewById(R.id.userLoginName);
        passLog= (EditText) findViewById(R.id.userLoginPassword);
        btLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this, informationAct.class);
                String user=nameLog.getText().toString();
                String pass=passLog.getText().toString();
                i.putExtra("name",user);
                i.putExtra("password",pass);
                startActivity(i);
                finish();


            }
        });
        btnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this, signInACt.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast toast=Toast.makeText(getApplicationContext(),"on start",Toast.LENGTH_SHORT);
        //toast.setMargin(50,50);
        toast.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast toast=Toast.makeText(getApplicationContext(),"app finished",Toast.LENGTH_SHORT);
        //toast.setMargin(50,50);
        toast.show();
    }
}