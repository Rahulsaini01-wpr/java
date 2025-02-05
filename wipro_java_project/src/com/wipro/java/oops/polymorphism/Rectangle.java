/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * The (Child Class 2) showing polymorphism
 * 
 * Polymorphism is the ability of one object to take many forms.
 * In this case, polymorphism is demonstrated by the `Rectangle` class overriding 
 * the `draw()` method of its parent class `Shape`.
 * 
 * Even though the parent class `Shape` has a `draw()` method, 
 * the `Rectangle` class provides its own implementation of the `draw()` method.
 * 
 * This is an example of **method overriding**, which is one type of polymorphism in Java.
 * 
 * When we call the `draw()` method on a `Shape` reference pointing to a `Rectangle` object, 
 * Java will call the overridden `draw()` method in the `Rectangle` class.
 */

public class Rectangle extends Shape {
 // Overriding the draw method of Shape class
 @Override
 public void draw() {
     System.out.println("Drawing a Rectangle");//Output: "Drawing a Rectangle"

 }
}