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
public class Rating implements Comparator<Movie1> {

    @Override
    public int compare(Movie1 m1, Movie1 m2) {
        // Sorting by rating in ascending order (change to descending if you want reverse order)
        return Double.compare(m1.getRating(), m2.getRating());
    }

    public static void main(String[] args) {
        // Create an ArrayList to hold Movie1 objects
        ArrayList<Movie1> m1 = new ArrayList<>();

        // Add Movie1 objects to the list
        m1.add(new Movie1("Spider Man", 8.8, 2014)); // Movie 1
        m1.add(new Movie1("Iron Man", 9.9, 2008));   // Movie 2
        m1.add(new Movie1("Bat Man", 8.9, 2006));    // Movie 3

        // Sort the movies list using the Rating comparator (sorting by rating)
        Collections.sort(m1, new Rating());

        // Print the sorted movies list
        for (Movie1 movie : m1) {
            System.out.println("Movie Name: " + movie.getName() + ", Rating: " + movie.getRating() + ", Year: " + movie.getYear());
        }
    }
}
