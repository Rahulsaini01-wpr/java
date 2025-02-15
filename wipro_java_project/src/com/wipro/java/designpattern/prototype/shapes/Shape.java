package com.wipro.java.designpattern.prototype.shapes;

import java.util.Objects;

/**
 * Abstract class representing a generic shape.
 */
public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape() {
    }

    // Copy constructor to clone an existing shape
    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    // Abstract clone method (to be implemented by subclasses)
    public abstract Shape clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) return false;
        Shape shape2 = (Shape) object2;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}
