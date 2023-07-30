package com.example.alphauni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class quizactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Button buttonback = (Button)findViewById(R.id.backbtn);
        Button submitbutton = (Button)findViewById(R.id.button4);
        Switch s1 = (Switch)findViewById(R.id.switch1);
        Switch s2 = (Switch)findViewById(R.id.switch2);
        Switch s3 = (Switch)findViewById(R.id.switch3);
        Switch s4 = (Switch)findViewById(R.id.switch4);
        Switch s5 = (Switch)findViewById(R.id.switch5);
        Switch s6 = (Switch)findViewById(R.id.switch6);
        Switch s7 = (Switch)findViewById(R.id.switch7);
        Switch s8 = (Switch)findViewById(R.id.switch8);
        Switch s9 = (Switch)findViewById(R.id.switch9);
        Switch s10 = (Switch)findViewById(R.id.switch10);
        TextView tv = (TextView)findViewById(R.id.textViewans);

        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!s1.isChecked() || !s2.isChecked() || !s3.isChecked() || !s4.isChecked() || !s5.isChecked()
                || !s6.isChecked() || !s7.isChecked() || !s8.isChecked() || !s9.isChecked() || !s10.isChecked()){
                    Toast.makeText(quizactivity.this, "Please answer all questions", Toast.LENGTH_LONG).show();
                }
                else{
                    if (s2.isChecked() && s8.isChecked()){
                        //Intent intent = new Intent(quizactivity.this, careeractivity.class);
                        //intent.putExtra("Career","HealthSciences");
                        //startActivity(intent);
                        tv.setText("Health Sciences");
                    }
                    else if (s6.isChecked()){
                        tv.setText("Humanities");
                    }
                    else if (s1.isChecked() && s9.isChecked()){
                        tv.setText("Engineering");
                    }
                    else if(s4.isChecked()){
                        tv.setText("Arts");
                    }
                    else if((s5.isChecked() && s10.isChecked()) || (s10.isChecked() && s7.isChecked())){
                        tv.setText("Science");
                    }
                    else{
                        tv.setText("Not Determinable, Please Try Again");
                    }
                }

            }
        });

        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(quizactivity.this, nextactivity.class);
                startActivity(intent);
            }
        });
    }

}