package com.wipro.java.oops.abstraction;

/**
 * SUV class is a subclass of the Car class.
 * This class represents an SUV type of car and can access the properties and methods 
 * inherited from the Car class.
 * It can also override methods from the Car class.
 * @author rahul
 */
public class SUV extends Car {

	@Override
    public void start() {
        System.out.println("Starting the Sedan car...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the Sedan car...");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new SUV();
        
        // Calling the implemented methods
        myCar.start();
        myCar.stop();

	}
}
