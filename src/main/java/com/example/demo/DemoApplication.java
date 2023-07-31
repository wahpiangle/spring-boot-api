package com.example.demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.student.Student;

@SpringBootApplication
@RestController //adding this annotation to make this class a controller

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping //adding this annotation to make this method a GET request handler
	public List<Student> hello() {
		return List.of(
				new Student(1L, "Mariam", "mariam@studnet.com", LocalDate.of(2000, Month.JANUARY, 4),21)
		);
	}

}