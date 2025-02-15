package com.wipro.java.designpattern.builder.components;

/**
 * Represents a GPS navigator for the car.
 */
public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "Default route: 221B Baker Street to Scotland Yard, London";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
