package com.wipro.java.java8;

// First interface with a default method
interface TestInterface4 {
    default void display() {
        System.out.println("Default method in TestInterface4");
    }
}

// Second interface with a default method (same method name as in TestInterface4)
interface TestInterface3 {
    default void display() {
        System.out.println("Default method in TestInterface3");
    }
}

// Class implementing both interfaces and resolving the method conflict
class DefaultUseCase implements TestInterface4, TestInterface3 {

    // Overriding the default method to resolve ambiguity
    @Override
    public void display() {
        System.out.println("Overriding show() to call both interface methods:");

        // Calling show() from TestInterface3
        TestInterface3.super.display();

        // Calling show() from TestInterface4
        TestInterface4.super.display();
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        // Creating an instance of DefaultUseCase
        DefaultUseCase d = new DefaultUseCase();

        // Calling the overridden show() method
        d.display();
    }
}