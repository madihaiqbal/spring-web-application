package com.example.demo1.student;

import com.example.demo1.student.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudent() {
        return List.of(
                new Student(
                        1L,
                        "Mahnoor",
                        LocalDate.of(1999, Month.SEPTEMBER, 28),
                        23,
                        "6th",
                        "Civil Engineering"
                )
        );
    }
}
