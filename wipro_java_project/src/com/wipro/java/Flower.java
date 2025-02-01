/**
 * 
 */
package com.wipro.java;

/**
 * @author rahul
 */
public class Flower {
    // properties and behaviours
    // name, color, fragrance, height, type of flower
    // rose, red, sweet, 2ft, bush
    // lily, white, strong, 3ft, herbaceous

    // Member variables
    String nameValue; // data type: String
    String colorValue; // data type: String
    String fragranceValue; // data type: String
    int heightValue; // data type: integer
    String typeValue; // data type: String

    // Constructor
    Flower(String name, String color, String fragrance, int height, String type) {
        this.nameValue = name; // using 'this' to refer to current object's properties
        this.colorValue = color;
        this.fragranceValue = fragrance;
        this.heightValue = height;
        this.typeValue = type;
    }

    // Method to combine properties and behaviors
    void display() {
        System.out.println("Flower name: " + nameValue);
        System.out.println("Flower color: " + colorValue);
        System.out.println("Flower fragrance: " + fragranceValue);
        System.out.println("Flower height: " + heightValue + "ft");
        System.out.println("Flower type: " + typeValue);
    }

    public static void main(String[] args) {
        // Object is an instance of the class
    	Flower flowerObject1 = new Flower("Rose", "Red", "Sweet", 20, "Bush");
        Flower flowerObject2 = new Flower("Lily", "White", "Strong", 3, "Herbaceous");

        // Display flower properties
        flowerObject1.display();
        flowerObject2.display();
    }
}
