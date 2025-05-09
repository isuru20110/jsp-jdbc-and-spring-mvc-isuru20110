package com.university.model;

public class Course {
    private int courseId;
    private String name;
    private String instructor;
    private int credits;

    public Course(int courseId, String name, String instructor, int credits) {
        this.courseId = courseId;
        this.name = name;
        this.instructor = instructor;
        this.credits = credits;
    }

    // Getters and setters
}
