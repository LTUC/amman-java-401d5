package com.asac.helloworld.Controllers;

import com.asac.helloworld.Models.Student;
import com.asac.helloworld.Repositories.StudentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Controller
public class StudentController {

    @Autowired
    StudentRespository studentRespository;

    @GetMapping("/students")     // Just for testing
    //@PostMapping("/students")  // the correct mapping
    public RedirectView addStudent(){
        Student std = new Student("Mohammad",1234);
        studentRespository.save(std);
        return new RedirectView("/allstudents");
    }

    @GetMapping("/allstudents")
    public String getAllStudents(Model model){
        ArrayList<Student> students = (ArrayList<Student>) studentRespository.findAll();
        model.addAttribute("students", students);
        return "home";
    }

}
