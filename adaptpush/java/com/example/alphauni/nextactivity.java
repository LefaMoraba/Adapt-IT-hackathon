package com.example.alphauni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class nextactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Button profilebtn = (Button)findViewById(R.id.profilebtn);
        Button documentsbtn = (Button)findViewById(R.id.docbtn);
        Button quizbtn = (Button)findViewById(R.id.quizbtn);
        Button applybtn = (Button)findViewById(R.id.applybtn);
        Button backbtn = (Button)findViewById(R.id.backbtn);

        profilebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(nextactivity.this, profileactivity.class);
                startActivity(intent);
            }
        });

        documentsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(nextactivity.this, documentsactivity.class);
                startActivity(intent);
            }
        });

        quizbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(nextactivity.this, quizactivity.class);
                startActivity(intent);
            }
        });

        applybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(nextactivity.this, applyactivity.class);
                startActivity(intent);
            }
        });
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(nextactivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}