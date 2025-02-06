/**
 * 
 */
package com.wipro.java.collection;

//Import necessary classes for collection
import java.util.ArrayList;
import java.util.Collections;

/**
* Animal class implements Comparable to allow sorting of animals based on their age.
*/
public class Animal implements Comparable<Animal> {
 // Instance variables to store animal name, age, and species
 private String name;   // Animal name
 private int age;       // Animal age
 private String species; // Animal species

 /**
  * Constructor to initialize an Animal object with name, age, and species.
  *
  * @param name The name of the animal.
  * @param age The age of the animal.
  * @param species The species of the animal.
  */
 public Animal(String name, int age, String species) {
     this.name = name;     // Set animal name
     this.age = age;       // Set animal age
     this.species = species; // Set animal species
 }

 /**
  * compareTo method from Comparable interface to define the sorting order.
  * This implementation sorts the animals based on their age in ascending order.
  *
  * @param a The animal to be compared.
  * @return A negative value if the current animal's age is less than the compared animal's age,
  *         zero if they are equal, and a positive value if the current animal's age is greater.
  */
 @Override
 public int compareTo(Animal a) {
     // Compare based on age (in ascending order)
     return this.age - a.age; // Return difference of ages for sorting
 }

 // Getter method to retrieve the name of the animal
 public String getName() {
     return name;
 }

 // Getter method to retrieve the age of the animal
 public int getAge() {
     return age;
 }

 // Getter method to retrieve the species of the animal
 public String getSpecies() {
     return species;
 }

 /**
  * Main method to test the functionality of the Animal class.
  *
  * @param args Command line arguments.
  */
 public static void main(String[] args) {
     // Create an ArrayList to hold Animal objects
     ArrayList<Animal> animals = new ArrayList<>();

     // Add Animal objects to the list
     animals.add(new Animal("Lion", 5, "Panthera leo"));   // Animal 1
     animals.add(new Animal("Elephant", 10, "Elephas maximus")); // Animal 2
     animals.add(new Animal("Cat", 3, "Felis catus"));    // Animal 3

     // Sort the animals list using Comparable's compareTo method (sorting by age in ascending order)
     Collections.sort(animals);

     // Print the sorted animals list
     for (Animal animal : animals) {
         System.out.println("Animal Name: " + animal.getName() + ", Age: " + animal.getAge() + ", Species: " + animal.getSpecies());
     }
 }
}
