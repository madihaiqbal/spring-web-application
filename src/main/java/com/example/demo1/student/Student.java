package com.example.demo1.student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private LocalDate dob;
    private Integer age;
    private String semester;
    private String Department;

    public Student() {
    }

    public Student(Long id, String name, LocalDate dob, Integer age, String semester, String department) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.semester = semester;
        Department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
