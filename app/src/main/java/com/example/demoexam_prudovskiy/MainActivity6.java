package com.example.demoexam_prudovskiy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Button button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this, MainActivity5.class);
                startActivity(intent);
            }
        });


        EditText edit1 = (EditText) findViewById(R.id.edit1);
        EditText edit2 = (EditText) findViewById(R.id.edit2);
        EditText edit3 = (EditText) findViewById(R.id.edit3);
        EditText edit4 = (EditText) findViewById(R.id.edit4);
        String test = "1234";
        final String[] s1 = {"", "", "", ""};

        edit1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length()==1){
                    s1[0] = edit1.getText().toString();
                    edit2.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        edit2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length()==1){
                    s1[0] = edit2.getText().toString();
                    edit3.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });



        edit3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length()==1){
                    s1[0] = edit3.getText().toString();
                    edit4.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        edit4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length()==1){
                    s1[0] = edit4.getText().toString();
                    edit4.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}