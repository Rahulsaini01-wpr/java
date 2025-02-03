package com.wipro.java.oops.polymorphism;

import com.wipro.java.oops.inhertiance.Car;

/**
 * SUV class is a subclass of the Car class.
 * This class represents an SUV type of car and can access the properties and methods 
 * inherited from the Car class.
 * It can also override methods from the Car class.
 * @author rahul
 */
public class SUV extends Car {

    /**
     * Main method to demonstrate the creation and usage of an SUV object.
     * This method creates an instance of SUV (a subclass of Car) and demonstrates 
     * access to the inherited methods and properties.
     * 
     * @param args
     */
	
    public static void main(String[] args) {
        // Create an instance of SUV (which is a type of Car)
        Car car1 = new SUV();
        
        // Call the inherited getColor() method from the Car class to get the color of the car.
        car1.setColor("blue");
        car1.getColor();
    }
}
