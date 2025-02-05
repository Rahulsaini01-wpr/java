package com.wipro.java.interface1;
/**
 * This is the SpeedControl interface
 * Like Speedable, Stopable  defines a contract that any class implementing it must fulfill.
**/
//This interface defines methods related to accelerating and braking the vehicle.
//Interface to represent the ability to control speed.
public interface Speedable {
 void accelerate();  // Abstract method to accelerate.
 void brake();       // Abstract method to brake.
}


