package com.wipro.java.designpattern.builder;

// Importing necessary components from their respective packages
import com.wipro.java.designpattern.builder.cars.CarType;
import com.wipro.java.designpattern.builder.components.Engine;
import com.wipro.java.designpattern.builder.components.GPSNavigator;
import com.wipro.java.designpattern.builder.components.Transmission;
import com.wipro.java.designpattern.builder.components.TripComputer;

/**
 * The Builder interface defines the structure for constructing different car components.
 */
public interface Builder {
    
    // Method to set the car type (e.g., SUV, Sports Car, etc.)
    void setCarType(CarType type);

    // Method to define the number of seats in the car
    void setSeats(int seats);

    // Method to configure the engine of the car
    void setEngine(Engine engine);

    // Method to set the transmission type (Manual, Automatic, etc.)
    void setTransmission(Transmission transmission);

    // Method to add a trip computer feature to the car
    void setTripComputer(TripComputer tripComputer);

    // Method to include a GPS navigator in the car
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
