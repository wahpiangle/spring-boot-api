package com.example.demo.student;
// service layer

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service // adding this annotation to make this class a bean
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "mariam@studnet.com",
                        LocalDate.of(2000, Month.JANUARY, 4),
                        21));
    }
}
