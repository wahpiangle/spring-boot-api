package com.example.demo.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // adding this annotation to make this class a controller
@RequestMapping(path = "api/v1/student") // adding this sets the path for the controller

public class StudentController {

    private final StudentService studentService;

    @Autowired // adding this annotation to make this constructor a dependency injection
    public StudentController(StudentService studentService) { //constructor
        this.studentService = studentService; //this is so that StudentController.studentService calls the studentService object
    }

    @GetMapping // adding this annotation to make this method a GET request handler
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}
