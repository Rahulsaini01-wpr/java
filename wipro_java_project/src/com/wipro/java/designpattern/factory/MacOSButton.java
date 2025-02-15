package com.wipro.java.designpattern.factory; 

// Concrete product class representing a MacOS-style button
public class MacOSButton implements Buttons {
    
    // Implementation of the paint method specific to MacOS buttons
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
