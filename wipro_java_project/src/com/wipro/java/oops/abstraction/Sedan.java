/**
 * 
 */
package com.wipro.java.oops.abstraction;

/**
 * 
 */
public class Sedan extends Car {

	/**
	 * @param args
	 */
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
		Car myCar = new Sedan();
        
        // Calling the implemented methods
        myCar.start();
        myCar.stop();

	}

}
