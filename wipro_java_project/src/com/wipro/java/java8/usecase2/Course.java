package com.wipro.java.java8.usecase2;

public class Course {
    private String courseName;
    private int courseCode;

    // Constructor
    public Course(int courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    // Getter methods
    public String getCourseName() {
        return courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    @Override
    public String toString() {
        return "Course{" + "courseCode=" + courseCode + ", courseName='" + courseName + '\'' + '}';
    }
}
