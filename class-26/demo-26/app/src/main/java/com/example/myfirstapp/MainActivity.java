package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the button, and add an event handler to it
        Button goToOtherActivity = findViewById(R.id.goToOtherActivity);
        goToOtherActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_LONG).show();
                // to start another activity, we will use intent
                Intent goToOtherActivityIntent = new Intent(MainActivity.this, TheOtherActivity.class);
                goToOtherActivityIntent.putExtra("passedValue", "hello");
                startActivity(goToOtherActivityIntent);
            }
        });



    }

}