package com.wipro.java.designpattern.prototype;

import com.wipro.java.designpattern.prototype.cache.BundledShapeCache;
import com.wipro.java.designpattern.prototype.shapes.Shape;

/**
 * Demo class to test Prototype Pattern with a cache.
 */
public class DemoCache {
    public static void main(String[] args) {
        BundledShapeCache cache = new BundledShapeCache();

        Shape shape1 = cache.get("Big green circle");
        Shape shape2 = cache.get("Medium blue rectangle");
        Shape shape3 = cache.get("Medium blue rectangle");

        if (shape1 != shape2 && !shape1.equals(shape2)) {
            System.out.println("Big green circle != Medium blue rectangle !");
        } else {
            System.out.println("Big green circle == Medium blue rectangle !");
        }

        if (shape2 != shape3) {
            System.out.println("Medium blue rectangles are two different objects !");
            if (shape2.equals(shape3)) {
                System.out.println("And they are identical !");
            } else {
                System.out.println("But they are not identical !");
            }
        } else {
            System.out.println("Rectangle objects are the same !");
        }
    }
}
