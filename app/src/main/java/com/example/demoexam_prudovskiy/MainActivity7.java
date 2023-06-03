package com.example.demoexam_prudovskiy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        ImageView pin1 = findViewById(R.id.pin1);
        Button a = findViewById(R.id.button17);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pin1.setImageResource(R.drawable.epsb);
            }
        });
    }
}