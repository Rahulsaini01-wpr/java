package com.wipro.java.collection.hashmap; // Defines the package where this class resides

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Student class representing a student with a name and roll number
class Student {
    String name;  // Stores the name of the student
    int rollNumber; // Stores the roll number of the student

    // Constructor to initialize Student object
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Overriding toString() to return student details in a readable format
    @Override
    public String toString() {
        return "(" + name + ", " + rollNumber + ")";
    }
}

// Main class to demonstrate the use of HashMap with duplicate roll numbers
public class HashMapStudent {
    public static void main(String[] args) {
        // Creating a HashMap where the key is the roll number, and the value is a list of students
        Map<Integer, List<Student>> studentMap = new HashMap<>();

        // Adding 10 students, some with duplicate roll numbers
        addStudent(studentMap, new Student("Pratik", 101));  // First entry for roll number 101
        addStudent(studentMap, new Student("Rahul", 102));   // First entry for roll number 102
        addStudent(studentMap, new Student("Manikanta", 103)); // Unique roll number 103
        addStudent(studentMap, new Student("Preeti", 104));  // Unique roll number 104
        addStudent(studentMap, new Student("Ram", 105));     // Unique roll number 105
        addStudent(studentMap, new Student("Chandu", 101));  // Duplicate roll number 101
        addStudent(studentMap, new Student("Prakhar", 102)); // Duplicate roll number 102
        addStudent(studentMap, new Student("Nikhil", 106));  // Unique roll number 106
        addStudent(studentMap, new Student("Dinga", 107));   // Unique roll number 107
        addStudent(studentMap, new Student("Dingi", 108));   // Unique roll number 108

        // Iterating through the HashMap and printing the list of students for each roll number
        for (Map.Entry<Integer, List<Student>> entry : studentMap.entrySet()) {
            System.out.println("Roll Number " + entry.getKey() + ": " + entry.getValue());
        }
    }

    // Method to add a student to the HashMap
    private static void addStudent(Map<Integer, List<Student>> map, Student student) {
        // If the roll number is not present, create a new list and add the student to it
        map.computeIfAbsent(student.rollNumber, k -> new ArrayList<>()).add(student);
    }
}
