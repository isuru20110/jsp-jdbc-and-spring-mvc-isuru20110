package com.university.controller.model;

public class Student {
    private int studentId;
    private String name;
    private String email;
    private String password;

    public Student(int studentId, String name, String email, String password) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
