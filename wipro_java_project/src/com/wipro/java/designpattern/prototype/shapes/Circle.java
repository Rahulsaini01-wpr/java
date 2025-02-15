package com.wipro.java.designpattern.prototype.shapes;

/**
 * Concrete class representing a Circle.
 */
//Declaring the Circle class, which extends the Shape class (inherits its properties and methods)
public class Circle extends Shape {  

 // A public field to store the radius of the circle
 public int radius;  

 // Default constructor (creates an empty circle)
 public Circle() {  
 }

 // Copy constructor: Creates a new Circle by copying an existing one
 public Circle(Circle target) {  
     // Calling the parent class (Shape) constructor to copy common fields
     super(target);  
     // If the target is not null, copy its radius value
     if (target != null) {  
         this.radius = target.radius;
     }
 }

 // Overriding the clone method to create an exact copy of the current Circle object
 @Override
 public Shape clone() {  
     return new Circle(this);  // Calls the copy constructor to duplicate the object
 }

 // Overriding the equals method to compare two Circle objects
 @Override
 public boolean equals(Object object2) {  
     // Check if the object is not a Circle or if the parent class's equals method fails
     if (!(object2 instanceof Circle) || !super.equals(object2)) return false;  
     // Convert the object to a Circle type and compare the radius
     Circle shape2 = (Circle) object2;  
     return shape2.radius == radius;  
 }
}
