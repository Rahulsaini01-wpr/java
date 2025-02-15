package com.wipro.java.designpattern.singleton;

/**
 * Demo class to test the Singleton Pattern.
 */
public class DemoSingleThread {
    public static void main(String[] args) {  // Main method - the entry point of the program

        // Printing instructions to understand the output
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");

        // Creating the first Singleton instance with the value "FOO"
        Singleton singleton = Singleton.getInstance("FOO");

        // Trying to create another Singleton instance with a different value "BAR"
        Singleton anotherSingleton = Singleton.getInstance("BAR");

        // Printing the values of both instances
        System.out.println(singleton.value);  // Expected output: "FOO"
        System.out.println(anotherSingleton.value);  // Expected output: "FOO" (same as the first instance)
    }
}
