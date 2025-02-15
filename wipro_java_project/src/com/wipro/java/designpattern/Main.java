package com.wipro.java.designpattern;

import com.wipro.java.designpattern.factory.GUIFactory;
import com.wipro.java.designpattern.factory.WindowFactory;

public class Main {  // Main class where the program starts execution
    public static void main(String[] args) {  // Main method, the entry point of the Java program
        
        // Creating an instance of WindowFactory, which will generate Windows UI components
        GUIFactory factory = new WindowFactory();  

        // Creating an instance of the Application class and passing the factory to it
        // The application will use this factory to create UI elements (button and checkbox)
        Application app = new Application(factory);  

        // Calling the paint method, which will render the Windows-style UI components
        app.paint();  
    }
}
