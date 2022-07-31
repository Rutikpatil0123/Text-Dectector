    package com.example.textdetector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Scanner;

    public class MainActivity extends AppCompatActivity {
    private Button button_capture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_capture = findViewById(R.id.button_capture);
        button_capture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ScannerActivity.class);
                startActivity(i);
            }
        });
    }
}