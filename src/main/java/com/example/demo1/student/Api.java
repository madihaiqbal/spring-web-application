package com.example.demo1.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RequestMapping("api/v1/student")
@RestController
public class Api {

    //reference
    private final StudentService studentService;

    @Autowired
    public Api(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping
    public List<Student> getStudent() {
        return studentService.getStudent();
    }

}
