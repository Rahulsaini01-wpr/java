package com.wipro.java.designpattern.factory;  

// Concrete product class representing a Windows-style checkbox
public class WindowCheckbox implements Checkbox {

    // Implementation of the paint method specific to Windows checkboxes
    @Override
    public void paint() {
        System.out.println("Rendering a Windows checkbox.");
    }
}
