package com.example.alphauni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_login = (Button)findViewById(R.id.button);
        Button btn_signin = (Button)findViewById(R.id.button2);

        EditText etemail = (EditText)findViewById(R.id.editTextTextEmailAddress);
        EditText etpassword = (EditText)findViewById(R.id.editTextTextPassword);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = etemail.getText().toString().toUpperCase();
                String password = etpassword.getText().toString();
                if (email.equals("") || password.equals("")) {
                    Toast.makeText(MainActivity.this, "Please enter a valid email address and password", Toast.LENGTH_LONG).show();
                }else{
                    Intent intent = new Intent(MainActivity.this, nextactivity.class);
                    startActivity(intent);
                }

            }
        });

        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, signupactivity.class);
                startActivity(intent);
            }
        });
    }
}