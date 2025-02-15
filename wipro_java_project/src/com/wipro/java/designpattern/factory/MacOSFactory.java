package com.wipro.java.designpattern.factory;  

// Concrete factory class for creating MacOS-specific UI components
public class MacOSFactory implements GUIFactory {
    
    // Creates and returns a MacOS-specific button
    @Override
    public Buttons createButton() {
        return new MacOSButton();
    }

    // Creates and returns a MacOS-specific checkbox
    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
