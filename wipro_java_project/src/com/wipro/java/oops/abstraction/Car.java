/**
 * 
 */
package com.wipro.java.oops.abstraction;

/**
 * 
 */
abstract class Car {
	/**
     * Abstract method to start the car.
     * Subclasses must provide their own implementation.
     */
    public abstract void start();

    /**
     * Abstract method to stop the car.
     * Subclasses must provide their own implementation.
     */
    public abstract void stop();

    /**
     * Concrete method to display common details about the car.
     * This method is inherited by subclasses and can be used directly.
     */
   
}
