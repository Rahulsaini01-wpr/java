/**
 * 
 */
package com.wipro.java.oops;

/**
 * @author rahul
 * POJO : Plain old java object access through getter/setter
 * Properties :
 * No Constructor
 * Getters have a return value
 * Setters have no return value
 * Properties are determined using private fields
 * values or behaviors are determined through setters
 * toString will convert the entire animal class with properties and behaviors
 * 
 * 
 */
public class Animal {

	/**
	 * Fields (properties = structure) of the Animal class
	 */
	private String animalName; // This is the animal's name
	private String animalSpecies; // This is the animal's species (e.g., Dog, Cat)
	private int animalAge; // This is the animal's age
	private String color; // The color of the animal
	private float size; // The size of the animal
	private float weight; // The weight of the animal
	

	/**
	 * @return the animalName
	 */
	public String getAnimalName() {
		return animalName;
	}

	/**
	 * @param animalName the animalName to set
	 */
	public void setAnimalName(String animalName) {
		this.animalName = "Leo";
	}

	/**
	 * @return the animalSpecies
	 */
	public String getAnimalSpecies() {
		return animalSpecies;
	}

	/**
	 * @param animalSpecies the animalSpecies to set
	 */
	public void setAnimalSpecies(String animalSpecies) {
		this.animalSpecies = "Lion";
	}

	/**
	 * @return the animalAge
	 */
	public int getAnimalAge() {
		return animalAge;
	}

	/**
	 * @param animalAge the animalAge to set
	 */
	public void setAnimalAge(int animalAge) {
		this.animalAge = 5;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = "Golden";
	}

	/**
	 * @return the size
	 */
	public float getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(float size) {
		this.size = 1.2f;
	}

	/**
	 * @return the weight
	 */
	public float getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(float weight) {
		this.weight = 190.5f;
	}

	// toString method to represent the Animal object as a string
	public String toString() {
		return "animalName=" + animalName + 
	               ", animalSpecies=" + animalSpecies + 
	               ", animalAge=" + animalAge + 
	               ", color=" + color + 
	               ", size=" + size + 
	               ", weight=" + weight + "]";

	
	}
	/**
	 * @param args
	 */
	 public static void main(String[] args) {
	        // Sample code to test the Animal class
	        Animal myAnimal = new Animal();

	        System.out.println(myAnimal);  // This will print the toString output
	    }
	}


