package com.example.studenthub;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

// 3.1 - create the class without extension
// 3.5 - extend the adapter
public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {
    // 3.2 Create the list of data (the object representing it)
    List<Student> allStudents = new ArrayList<Student>();

    public StudentAdapter(List<Student> allStudents) {
        this.allStudents = allStudents;
    }

    //3.3 Create our ViewHolder
    public static class StudentViewHolder extends RecyclerView.ViewHolder{
        // 3.4 add the view and the model object
        public Student student;
        public View itemView;

        // set the itemView Value
        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
        }
    }

     //3.5 creating and returning the view holder
    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // for now, we are dealing with this line as magic
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_blank,parent,false);
        StudentViewHolder studentViewHolder = new StudentViewHolder(view);
        return studentViewHolder;
    }

    //3.6 binding the data
    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        holder.student = allStudents.get(position);

        TextView studentName = holder.itemView.findViewById(R.id.studentNameInFragment);
        TextView schoolYear = holder.itemView.findViewById(R.id.schoolYearInFragment);

        studentName.setText(holder.student.studentName);
        schoolYear.setText(Integer.toString(holder.student.schoolYear));
    }

    @Override
    public int getItemCount() {
        return allStudents.size();
    }
}
