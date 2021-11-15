package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        TextView courseNameLabel = findViewById(R.id.courseNameLabel);
        String courseName = getIntent().getExtras().get("courseName").toString();
        courseNameLabel.setText(courseName);
    }
}