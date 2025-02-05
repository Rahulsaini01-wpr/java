/**
 * 
 */
package com.wipro.java.oops.library;

/**
 * (Child Class 2)
 */

//Child class: DigitalLibrary
public class DigitalLibrary extends Library {
 
 // Constructor to initialize name and location (using setter methods from parent)
 public DigitalLibrary(String name, String location) {
     setName(name);  // Using setter from parent class
     setLocation(location);  // Using setter from parent class
 }

 // Overriding displayDetails() method
 @Override
 public void displayDetails() {
     System.out.println("Digital Library Name: " + getName());
     System.out.println("Website: " + getLocation());  // Using location as website (simplified for this example)
 }
}