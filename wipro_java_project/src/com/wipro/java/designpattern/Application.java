package com.wipro.java.designpattern; 


// Importing required classes from the factory package
import com.wipro.java.designpattern.factory.Buttons;
import com.wipro.java.designpattern.factory.Checkbox;
import com.wipro.java.designpattern.factory.GUIFactory;

// Application class that initializes UI components using a GUIFactory
public class Application {
    private Buttons button;    // Button instance
    private Checkbox checkbox; // Checkbox instance

    // Constructor accepting a GUIFactory to create UI components dynamically
    public Application(GUIFactory factory) {
        this.button = factory.createButton();   // Create a button using the factory
        this.checkbox = factory.createCheckbox(); // Create a checkbox using the factory
    }

    // Method to render the UI components
    public void paint() {
        button.paint();   // Call paint method on button
        checkbox.paint(); // Call paint method on checkbox
    }
}
