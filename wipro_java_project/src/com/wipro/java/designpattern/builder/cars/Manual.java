package com.wipro.java.designpattern.builder.cars;

import com.wipro.java.designpattern.builder.components.Engine;
import com.wipro.java.designpattern.builder.components.GPSNavigator;
import com.wipro.java.designpattern.builder.components.Transmission;
import com.wipro.java.designpattern.builder.components.TripComputer;

/**
 * Represents a car manual. 
 * Unlike the `Car` class, this is just a document with specifications, not a real product.
 */
public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    /**
     * Prints the manual information.
     */
    public String print() {
        String info = "";
        info += "Type of car: " + carType + "\n";
        info += "Number of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        info += (this.tripComputer != null) ? "Trip Computer: Functional\n" : "Trip Computer: N/A\n";
        info += (this.gpsNavigator != null) ? "GPS Navigator: Functional\n" : "GPS Navigator: N/A\n";
        return info;
    }
}
