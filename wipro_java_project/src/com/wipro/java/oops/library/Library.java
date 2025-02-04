/**
 * 
 */
package com.wipro.java.oops.library;

/**
 * Abstract/Parent class Library
 */


public abstract class Library {
    
    // Encapsulation: private fields
    private String name;
    private String location;
    
    // Getter and Setter methods for name and location
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    // Abstract method: To be implemented by child classes
    public abstract void displayDetails();
}
