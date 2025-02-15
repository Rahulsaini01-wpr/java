package com.wipro.java.designpattern.factory;  

// Abstract Factory interface for creating UI components (buttons and checkboxes)
public interface GUIFactory {
    
    // Method to create a button, to be implemented by concrete factories
    Buttons createButton();
    
    // Method to create a checkbox, to be implemented by concrete factories
    Checkbox createCheckbox();
}
