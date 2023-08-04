package com.example.demo.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // adding this annotation to make this class a controller
@RequestMapping(path = "api/v1/student") // adding this sets the path for the controller

public class StudentController {

    private final StudentService studentService;

    // adding @Autowired to make this constructor a dependency injection
    @Autowired
    public StudentController(StudentService studentService) { //constructor
        this.studentService = studentService; //this is so that StudentController.studentService calls the studentService object
    }

    @GetMapping // adding this annotation to make this method a GET request handler
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }

    @DeleteMapping(path="{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long id){
        studentService.deleteStudent(id);
    }

    @PutMapping(path="{studentId}")
    public void updateStudent(
            @PathVariable("studentId") Long id,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email){
        studentService.updateStudent(id, name, email);
    }
}
