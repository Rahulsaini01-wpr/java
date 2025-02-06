/**
 * 
 */
package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 */
public class Name implements Comparator<Movie1> {

    @Override
    public int compare(Movie1 m1, Movie1 m2) {
        // Sorting by name in ascending order
        return m1.getName().compareTo(m2.getName());
    }

    public static void main(String[] args) {
        // Create an ArrayList to hold Movie objects
        ArrayList<Movie1> m1 = new ArrayList<>();

        // Add Movie objects to the list
        m1.add(new Movie1("Spider Man", 8.8, 2014)); // Movie 1
        m1.add(new Movie1("Iron Man", 9.9, 2008));   // Movie 2
        m1.add(new Movie1("Bat Man", 8.9, 2006));    // Movie 3

        // Sort the movies list using the Name comparator (sorting by name in ascending order)
        Collections.sort(m1, new Name());

        // Print the sorted movies list
        for (Movie1 movie : m1) {
            System.out.println("Movie Name: " + movie.getName() + ", Rating: " + movie.getRating() + ", Year: " + movie.getYear());
        }
    }
    
}
