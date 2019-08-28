package com.example.quicklauncher;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        if(getIntent().hasExtra("org.example.quicklauncher.SOMETHING")){
            TextView tv1 = findViewById(R.id.textView);
            String text = getIntent().getExtras().getString("org.example.quicklauncher.SOMETHING");
            tv1.setText(text);
        }

    }
}
