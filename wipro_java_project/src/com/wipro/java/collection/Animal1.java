package com.wipro.java.collection;

public class Animal1 {
    private String name;    // Animal name
    private int age;        // Animal age
    private String species; // Animal species

    // Constructor to initialize the Animal1 object with name, age, and species
    public Animal1(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    // Getter method for animal name
    public String getName() {
        return name;
    }

    // Getter method for animal age
    public int getAge() {
        return age;
    }

    // Getter method for animal species
    public String getSpecies() {
        return species;
    }
}
