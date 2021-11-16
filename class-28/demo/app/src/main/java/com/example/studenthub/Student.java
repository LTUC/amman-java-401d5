package com.example.studenthub;

// 1- Create the model class for your data
// 2- Create the fragment, the partial UI that will represent a single object (student)
// 2.2- fix the fragment class
// 3- Create the Adapter
public class Student {
    public String studentName;
    public Integer schoolYear;

    public Student(String studentName, Integer schoolYear) {
        this.studentName = studentName;
        this.schoolYear = schoolYear;
    }
}
