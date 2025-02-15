package com.wipro.java.designpattern.singleton;

/**
 * Naïve Singleton (Single-threaded).
 * Ensures that only one instance of Singleton exists.
 */
//Declaring the class as final to prevent inheritance
public final class Singleton {  

 // A private static instance variable to store the single instance of the class
 private static Singleton instance;  

 // A public field to store the value of the Singleton instance
 public String value;  

 // Private constructor to prevent object creation from outside the class
 private Singleton(String value) {  
     // Simulating slow initialization with a delay of 1 second
     try {
         Thread.sleep(1000);
     } catch (InterruptedException ex) {
         ex.printStackTrace();
     }
     // Assigning the value passed to the constructor
     this.value = value;
 }

 // Static method to return the single instance of the class
 public static Singleton getInstance(String value) {  
     // If no instance exists, create one
     if (instance == null) {  
         instance = new Singleton(value);
     }
     // Return the same instance every time
     return instance;  
 }
}
