package com.example.studenthub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button goToAllStudnetsButton = findViewById(R.id.allStudentsButton);
        goToAllStudnetsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToAllStudentsIntent = new Intent(MainActivity.this, AllStudents.class);
                startActivity(goToAllStudentsIntent);
            }
        });
    }
}