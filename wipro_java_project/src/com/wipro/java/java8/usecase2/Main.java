package com.wipro.java.java8.usecase2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Creating Course objects
        Course math = new Course(101, "Mathematics");
        Course science = new Course(102, "Science");
        Course history = new Course(103, "History");

        // 1. Using Array to hold courses for John (static size)
        Course[] johnCoursesArray = new Course[3];
        johnCoursesArray[0] = math;
        johnCoursesArray[1] = science;
        johnCoursesArray[2] = history;

        // 2. Using ArrayList (dynamic size)
        List<Course> janeCourses = new ArrayList<>();
        janeCourses.add(history);

        // 3. Using LinkedList (useful for fast insertions and deletions)
        LinkedList<Course> johnLinkedListCourses = new LinkedList<>();
        johnLinkedListCourses.add(math);
        johnLinkedListCourses.add(science);
        
        // 4. Using HashMap (id -> student)
        Map<Integer, Student> studentMap = new HashMap<>();
        Student john = new Student(1, "John Doe");
        john.setCourses(new ArrayList<>(Arrays.asList(johnCoursesArray))); // Converting Array to List
        studentMap.put(john.getId(), john);
        
        Student jane = new Student(2, "Jane Smith");
        jane.setCourses(janeCourses);
        studentMap.put(jane.getId(), jane);

        // Displaying students and their courses
        for (Student student : studentMap.values()) {
            System.out.println(student);
            System.out.println("Courses: " + student.getCourses());
        }

        // Add another course to John's LinkedList
        johnLinkedListCourses.add(history);
        System.out.println("\nAfter adding History course to John's LinkedList:");
        System.out.println("John's LinkedList Courses: " + johnLinkedListCourses);
        
        // Demonstrating Array usage - Printing John's array of courses
        System.out.println("\nJohn's courses from Array:");
        for (Course course : johnCoursesArray) {
            System.out.println(course);
        }
    }
}
