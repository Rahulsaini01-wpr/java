package com.wipro.java.interface1;
/**
 * This class implements both EngineStartStop and SpeedControl interfaces
 * In Java, a class can implement one or more interfaces to define the behavior of certain methods.
**/

//It is a concrete class that provides implementation of all the methods defined in both interfaces.
//Class implementing Startable, Stoppable, and Speedable interfaces
public class Car implements Stoppable, Speedable {

 // Implement stop() from Stoppable interface
 @Override
 public void stop() {
     System.out.println("Car stopped.");
 }

 // Implement accelerate() from Speedable interface
 @Override
 public void accelerate() {
     System.out.println("Car is accelerating.");
 }

 // Implement brake() from Speedable interface
 @Override
 public void brake() {
     System.out.println("Car is braking.");
 }

 public static void main(String[] args) {
     // Create a Car object
     Car car = new Car();

     // Use the Car object to call methods from all three interfaces
     car.accelerate();  // Accelerate the car
     car.brake();       // Brake the car
     car.stop();        // Stop the car
 }
}
