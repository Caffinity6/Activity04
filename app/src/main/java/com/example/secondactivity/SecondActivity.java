package com.example.secondactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final TextView textView2 = findViewById(R.id.textView2);

        Intent intent = getIntent();
        String str;
        str = intent.getStringExtra("MY_MESSAGE");
        textView2.setText(str.toString());

        final Button btnClick2 = findViewById(R.id.btnClick2);

        btnClick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}