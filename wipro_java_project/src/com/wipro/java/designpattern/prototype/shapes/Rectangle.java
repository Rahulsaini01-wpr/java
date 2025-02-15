package com.wipro.java.designpattern.prototype.shapes;

/**
 * Concrete class representing a Rectangle.
 */
//Declaring the Rectangle class, which extends the Shape class (inherits common properties)
public class Rectangle extends Shape {  

 // Public fields to store the width and height of the rectangle
 public int width;  
 public int height;  

 // Default constructor (creates an empty rectangle)
 public Rectangle() {  
 }

 // Copy constructor: Creates a new Rectangle by copying an existing one
 public Rectangle(Rectangle target) {  
     // Calling the parent class (Shape) constructor to copy common fields
     super(target);  
     // If the target is not null, copy its width and height
     if (target != null) {  
         this.width = target.width;
         this.height = target.height;
     }
 }

 // Overriding the clone method to create an exact copy of the current Rectangle object
 @Override
 public Shape clone() {  
     return new Rectangle(this);  // Calls the copy constructor to duplicate the object
 }

 // Overriding the equals method to compare two Rectangle objects
 @Override
 public boolean equals(Object object2) {  
     // Check if the object is not a Rectangle or if the parent class's equals method fails
     if (!(object2 instanceof Rectangle) || !super.equals(object2)) return false;  
     // Convert the object to a Rectangle type and compare the width and height
     Rectangle shape2 = (Rectangle) object2;  
     return shape2.width == width && shape2.height == height;  
 }
}
