package com.wipro.java.java8.usecase2;

import java.util.List;

public class Student {
    private String name;
    private int id;
    private List<Course> courses; // Using List to store courses

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    // Method to add course to the student's course list
    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + '\'' + '}';
    }
}
