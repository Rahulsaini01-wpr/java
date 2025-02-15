package com.wipro.java.designpattern.prototype;

import com.wipro.java.designpattern.prototype.shapes.Circle;
import com.wipro.java.designpattern.prototype.shapes.Rectangle;
import com.wipro.java.designpattern.prototype.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * Demo class to demonstrate the Prototype Pattern.
 */
public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        // Creating a circle
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        // Cloning the circle
        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        // Creating a rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        // Cloning and comparing shapes
        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects !");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical !");
                } else {
                    System.out.println(i + ": But they are not identical !");
                }
            } else {
                System.out.println(i + ": Shape objects are the same !");
            }
        }
    }
}
