package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserPreferences extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_preferences);

        Button preferencesButton = findViewById(R.id.submitNameButton);

        preferencesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText userNameField = findViewById(R.id.userNameEdit);
                String userName = userNameField.getText().toString();

                // add value to the shared preferences
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(UserPreferences.this);
                // first option
                sharedPreferences.edit().putString("userName",userName).apply();
                // second option
//                SharedPreferences.Editor sharedPreferencesEditor = sharedPreferences.edit();
//                sharedPreferencesEditor.putString("userName", userName);
//                sharedPreferencesEditor.apply();
                Toast.makeText(UserPreferences.this,"submitted!", Toast.LENGTH_LONG).show();
            }
        });

    }
}