package com.wipro.java.designpattern.prototype.cache;

import java.util.HashMap;
import java.util.Map;
import com.wipro.java.designpattern.prototype.shapes.Circle;
import com.wipro.java.designpattern.prototype.shapes.Rectangle;
import com.wipro.java.designpattern.prototype.shapes.Shape;

/**
 * A cache that stores prototype objects.
 * It allows retrieving pre-defined shapes and cloning them.
 */
public class BundledShapeCache {  

    // A HashMap to store shape objects with a string key
    private final Map<String, Shape> cache = new HashMap<>();  

    /**
     * Constructor initializes the cache with predefined shape objects.
     */
    public BundledShapeCache() {  
        // Creating and caching a Circle object
        Circle circle = new Circle();  
        circle.x = 5;
        circle.y = 7;
        circle.radius = 45;
        circle.color = "Green";

        // Creating and caching a Rectangle object
        Rectangle rectangle = new Rectangle();  
        rectangle.x = 6;
        rectangle.y = 9;
        rectangle.width = 8;
        rectangle.height = 10;
        rectangle.color = "Blue";

        // Storing objects in the cache with unique keys
        cache.put("Big green circle", circle);
        cache.put("Medium blue rectangle", rectangle);
    }

    /**
     * Adds a new shape to the cache with a given key.
     * @param key The name of the shape.
     * @param shape The shape object to store.
     * @return The shape object that was added.
     */
    public Shape put(String key, Shape shape) {  
        cache.put(key, shape);
        return shape;
    }

    /**
     * Retrieves a shape from the cache and clones it before returning.
     * @param key The name of the shape.
     * @return A new cloned instance of the shape.
     */
    public Shape get(String key) {  
        return cache.get(key).clone();  // Cloning ensures that each retrieval returns a unique copy
    }
}
