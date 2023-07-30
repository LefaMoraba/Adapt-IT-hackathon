package com.example.alphauni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signupactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        Button btn_sign = (Button)findViewById(R.id.signbtn);
        Button btn_back = (Button)findViewById(R.id.backbtn);
        EditText etname = (EditText)findViewById(R.id.editTextTextName);
        EditText etsurname = (EditText)findViewById(R.id.editTextTextSurname);
        EditText etid = (EditText)findViewById(R.id.editTextTextID);
        EditText etpassword = (EditText)findViewById(R.id.editTextTextPassword);
        EditText etemail = (EditText)findViewById(R.id.editTextTextEmailAddress);
        EditText etconfpassword = (EditText)findViewById(R.id.editTextTextConfirmPassword);

        btn_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = etname.getText().toString().toUpperCase();
                String surname = etsurname.getText().toString().toUpperCase();
                String id = etid.getText().toString();
                String email = etemail.getText().toString().toUpperCase();
                String password = etpassword.getText().toString();
                String confpassword = etconfpassword.getText().toString();
                if (name.equals("") || surname.equals("") || id.equals("")|| email.equals("")|| password.equals("")||confpassword.equals("")){
                    Toast.makeText(signupactivity.this, "Please enter all details", Toast.LENGTH_LONG).show();
                }
                else{

                }
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signupactivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}