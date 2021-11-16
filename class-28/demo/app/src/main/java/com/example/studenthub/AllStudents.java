package com.example.studenthub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class AllStudents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_students);

        List<Student> allStudents = new ArrayList<Student>();
        allStudents.add(new Student("Bayan",2020));
        allStudents.add(new Student("Ahmad",2020));
        allStudents.add(new Student("Mamoun",2020));
        allStudents.add(new Student("Tamra",2020));
        allStudents.add(new Student("Abdalla",2020));
        allStudents.add(new Student("Obada",2020));
        allStudents.add(new Student("Malik",2020));
        allStudents.add(new Student("Qutada",2020));



        RecyclerView recyclerView = findViewById(R.id.allStudentsView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new StudentAdapter(allStudents));

    }
}