/**
 * 
 */
package com.wipro.java.oops.inhertiance;

/**
 * Car class represents a generic car with properties like model, color, and engine type.
 * This class provides getters and setters for these properties and a method to display the car details.
 * POJO : Plain Old Java Object with getter/setter access.
 * @author rahul
 */
public class Car {
	// Fields (attributes) of the Car class
    private String model; // The model of the car (e.g., Sedan, SUV)
    private String color; // The color of the car
    private String engineType; // The type of engine (e.g., Petrol, Diesel)
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the engineType
	 */
	public String getEngineType() {
		return engineType;
	}
	/**
	 * @param engineType the engineType to set
	 */
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public void display() {
	        System.out.println("Car model: " + model);
	        System.out.println("Car color: " + color);
	        System.out.println("Car engineType: " + engineType);
	    }
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", engineType=" + engineType + "]";
	}
	
    
}
