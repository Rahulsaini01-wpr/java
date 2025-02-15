package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Comparator class to sort movies by rating
class Rate implements Comparator<Movie1> {
    // Method to compare two movies based on their rating in descending order
    public int compare(Movie1 m1, Movie1 m2) {
        return Double.compare(m2.getRating(), m1.getRating()); // Higher rating first
    }

    public static void main(String[] args) {
        // Creating a list to store movie objects
        ArrayList<Movie1> movies = new ArrayList<>();
        
        // Adding movie details to the list
        movies.add(new Movie1("Force Awakens", 8.3, 2015));
        movies.add(new Movie1("Star Wars", 8.7, 1977));
        movies.add(new Movie1("Empire Strikes Back", 8.8, 1980));
        
        // Sorting movies based on rating using the Rate comparator
        Collections.sort(movies, new Rate());
        
        // Displaying the sorted movies
        System.out.println("Movies sorted by rating:");
        for (Movie1 m : movies) {
            // Printing rating, name, and year of each movie
            System.out.println(m.getRating() + " " + m.getName() + " " + m.getYear());
        }
    }
}
