package com.example.intenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final EditText mNameEt = findViewById(R.id.nameEt);
        final EditText mEmailEt = findViewById(R.id.emailEt);
        final EditText mPhoneEt = findViewById(R.id.phoneEt);
        //Button
        Button mLoginBtn = findViewById(R.id.loginBtn);


        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get data from edit text
                String name = mNameEt.getText().toString();
                String email = mEmailEt.getText().toString();
                String phone = mPhoneEt.getText().toString();

                //activity intent
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("NAME", name);
                intent.putExtra("EMAIL", email);
                intent.putExtra("PHONE", phone);
                startActivity(intent);

            }
        });
    }
}