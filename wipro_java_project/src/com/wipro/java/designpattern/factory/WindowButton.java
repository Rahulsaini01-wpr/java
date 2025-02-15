package com.wipro.java.designpattern.factory;

// Concrete product class representing a Windows-style button
public class WindowButton implements Buttons {

    // Implementation of the paint method specific to Windows buttons
    @Override
    public void paint() {
        System.out.println("Rendering a Windows button.");
    }
}
