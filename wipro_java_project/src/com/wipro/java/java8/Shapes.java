package com.wipro.java.java8;

//Functional Interface defining the shape-related operations
@FunctionalInterface
interface ShapeOperations {

	// Abstract method for calculating area (enforced by the functional interface)
	public void calculateArea();

	// Default method to display the shape information
	default void displayShapeDetails() {
		System.out.println("This is a shape.");
	}

	// Default method to calculate and print the area of a square
	default void printSquareArea(double sideLength) {
		double area = sideLength * sideLength;
		System.out.println("Area of Square (side: " + sideLength + "): " + area);
	}

	// Static method to calculate the area of a rectangle
	static double calculateRectangleArea(double length, double width) {
		double area = length * width;
		System.out.println("Calculating area of rectangle (length: " + length + ", width: " + width + "): " + area);
		return area;
	}

	// Static method to display a general message about shapes
	static void displayGeneralMessage() {
		System.out.println("Shapes are fundamental in geometry and design.");
	}
}

//Main class implementing the ShapeOperations interface
public class Shapes implements ShapeOperations {

	// Implementing the abstract method (if needed, area logic can go here)
	@Override
	public void calculateArea() {
		// Placeholder: Could be overridden by specific shape classes (e.g., Circle,
		// Rectangle, etc.)
		System.out.println("Calculating area (abstract method).");
	}

	// Main method to execute and test shape operations
	public static void main(String[] args) {
		// Create an instance of the ShapeImpl class
		Shapes shape = new Shapes();
		// Calling abstract Method.
		shape.calculateArea();
		// Display shape information using default method
		shape.displayShapeDetails();

		// Print square area by calling the default method
		shape.printSquareArea(4); // Example: Side length of 4

		// Calling static method from the interface to calculate and display the
		// rectangle area
		double rectangleArea = ShapeOperations.calculateRectangleArea(5, 3); // Example: Length = 5, Width = 3
		System.out.println("Final Rectangle Area: " + rectangleArea);

		// Calling the static method to display a general message about shapes
		ShapeOperations.displayGeneralMessage();
	}
}