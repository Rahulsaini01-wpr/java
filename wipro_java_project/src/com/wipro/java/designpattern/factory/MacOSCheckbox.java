package com.wipro.java.designpattern.factory;  

// Concrete product class representing a MacOS-style checkbox
public class MacOSCheckbox implements Checkbox {

    // Implementation of the paint method specific to MacOS checkboxes
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
