package com.wipro.java.designpattern.factory;  
// Factory class implementing GUIFactory to create Windows-specific UI components
public class WindowFactory implements GUIFactory {

    // Method to create a Windows-style button
    @Override
    public Buttons createButton() {
        return new WindowButton();
    }

    // Method to create a Windows-style checkbox
    @Override
    public Checkbox createCheckbox() {
        return new WindowCheckbox();
    }
}
