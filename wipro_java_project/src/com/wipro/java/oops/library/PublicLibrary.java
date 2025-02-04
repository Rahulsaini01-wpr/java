/**
 * 
 */
package com.wipro.java.oops.library;

/**
 *  (Child Class 1)
 */
//Child class: PublicLibrary
public class PublicLibrary extends Library {
 
 // Constructor to initialize name and location (using setter methods from parent)
 public PublicLibrary(String name, String location) {
     setName(name);  // Using setter from parent class
     setLocation(location);  // Using setter from parent class
 }

 // Overriding displayDetails() method
 @Override
 public void displayDetails() {
     System.out.println("Public Library Name: " + getName());
     System.out.println("Location: " + getLocation());
 }
 
 // Main method to demonstrate polymorphism
 public static void main(String[] args) {
     // Creating objects of PublicLibrary and DigitalLibrary using parent class reference
     Library publicLibrary = new PublicLibrary("Central Library", "New York");
     
     // Demonstrating polymorphism: Calling the overridden method
     publicLibrary.displayDetails();  // Displays Public Library details
 }
}

