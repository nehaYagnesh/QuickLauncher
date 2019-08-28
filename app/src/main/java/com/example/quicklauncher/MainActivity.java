package com.example.quicklauncher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Attempts to launch an activity within our own app
        Button secondActivityBtn = findViewById(R.id.secondActivityBtn);
        secondActivityBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(),SecondActivity.class);
                startIntent.putExtra("org.example.quicklauncher.SOMETHING","HELLO WORLD!");
                startActivity(startIntent);
            }
        });

        //Attempt to launch an activity outside an app
        Button googleButton = findViewById(R.id.googleBtn);
        googleButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String google = "http://www.yahoo.com";
                Uri webaddress = Uri.parse(google);

                Intent goToGoogle = new Intent(Intent.ACTION_VIEW,webaddress);
                if(goToGoogle.resolveActivity(getPackageManager())!=null){
                    startActivity(goToGoogle);
                }
            }
        });
    }
}

