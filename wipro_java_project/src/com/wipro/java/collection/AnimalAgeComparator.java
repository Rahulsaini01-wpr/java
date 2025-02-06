package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal1> {

    @Override
    public int compare(Animal1 a1, Animal1 a2) {
        // Sorting by age (ascending order)
        return Integer.compare(a1.getAge(), a2.getAge());
    }

    public static void main(String[] args) {
        // Create an ArrayList to hold Animal1 objects
        ArrayList<Animal1> animals = new ArrayList<>();

        // Add Animal1 objects to the list
        animals.add(new Animal1("Lion", 5, "Panthera leo"));
        animals.add(new Animal1("Elephant", 10, "Elephas maximus"));
        animals.add(new Animal1("Cat", 3, "Felis catus"));

        // Sort the animals list using the AgeComparator (sorting by age)
        Collections.sort(animals, new AnimalAgeComparator());

        // Print the sorted animals list
        for (Animal1 animal : animals) {
            System.out.println("Animal Name: " + animal.getName() + ", Age: " + animal.getAge() + ", Species: " + animal.getSpecies());
        }
    }
}
