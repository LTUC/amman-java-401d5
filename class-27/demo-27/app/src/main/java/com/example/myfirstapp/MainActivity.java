package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button searchButton = findViewById(R.id.courseSearchButton);
        EditText courseText = findViewById(R.id.courseName);

        Button preferencesButton = findViewById(R.id.preferencesButton);


        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String courseName = courseText.getText().toString();
                Intent goToCoursePage = new Intent(MainActivity.this,CourseActivity.class);
                goToCoursePage.putExtra("courseName", courseName);
                startActivity(goToCoursePage);
            }
        });


        preferencesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToPreferencesPage = new Intent(MainActivity.this, UserPreferences.class);
                startActivity(goToPreferencesPage);
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
        String userName = sharedPreferences.getString("userName","the user didn't add a name yet!");
        Toast.makeText(this, userName,Toast.LENGTH_LONG).show();
    }


}