package com.wipro.java.oops.encapsulation;

public class Animal {

    private String name;
    private int age;

    // Constructor to initialize Animal object
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Animal animal = new Animal("Lion", 5);

        System.out.println("Animal Name: " + animal.getName());
        System.out.println("Animal Age: " + animal.getAge());

        animal.setAge(7);  // Setting new age
        System.out.println("Updated Animal Age: " + animal.getAge());

        animal.setAge(-3);  // Trying to set an invalid age
    }
}
