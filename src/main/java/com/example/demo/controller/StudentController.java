package com.example.demo.controller;

import com.example.demo.enums.Gender;
import com.example.demo.models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        List<Student> studentList = Arrays.asList(
                new Student(1L,
                        "Ismail",
                        "ismailramjean@gmail.com",
                        Gender.MALE),
                new Student(2L,
                        "Ismail2",
                        "gmail2@gmail.com",
                        Gender.OTHER)
        );

        return studentList;
    }
}
