package com.wipro.java.oops.polymorphism;

import com.wipro.java.oops.inhertiance.Car;

/**
 * Sedan class is a subclass of the Car class.
 * This class represents a Sedan type of car and can access the properties and methods 
 * inherited from the Car class.
 * Like the SUV class, it can also override methods from the Car class.
 * @author rahul
 */
public class Sedan extends Car {

    /**
     * Main method to demonstrate the creation and usage of a Sedan object.
     * This method creates an instance of Sedan (a subclass of Car) and demonstrates 
     * access to the inherited methods and properties.
     * 
     * @param args Command-line arguments (not used in this case).
     */
	
    public static void main(String[] args) {
        // Create an instance of Sedan (which is a type of Car)
        Car car1 = new Sedan();
        
        // Call the inherited getColor() method from the Car class to retrieve the color of the car.
        // The color is assumed to be set in the Car class or via a setter method, 
        car1.setColor("red");
        car1.setEngineType("Petrol");
        car1.setModel("Honda Accord");
        // but this specific code snippet doesn't show how the color is set.
        car1.getColor();
       
    }
}
