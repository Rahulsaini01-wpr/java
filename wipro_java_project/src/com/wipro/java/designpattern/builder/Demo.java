package com.wipro.java.designpattern.builder;

import com.wipro.java.designpattern.builder.cars.Car;
import com.wipro.java.designpattern.builder.cars.Manual;
import com.wipro.java.designpattern.builder.director.Director;

/**
 * Demo class where everything comes together.
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        // Creating a car builder
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // Getting the built car
        Car car = builder.getResult();
        System.out.println("Car built:\n " + car.getCarType());
        
        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

 }

