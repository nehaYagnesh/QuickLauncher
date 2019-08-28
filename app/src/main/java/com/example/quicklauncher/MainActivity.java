package com.example.quicklauncher;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button secondActivityBtn = findViewById(R.id.secondActivityBtn);
        Button googleBtn = findViewById(R.id.googleBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(),SecondActivity.class);
                startIntent.putExtra("org.example.quicklauncher.SOMETHING","HELLO WORLD!");
                startActivity(startIntent);
            }
        });


    }
}
