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
public class Year implements Comparator<Movie1> {

    @Override
    public int compare(Movie1 m1, Movie1 m2) {
        // Sorting by year in ascending order (use Integer.compare for int types)
        return Integer.compare(m1.getYear(), m2.getYear());
    }


    public static void main(String[] args) {
        // Create an ArrayList to hold Movie1 objects
        ArrayList<Movie1> m1 = new ArrayList<>();

        // Add Movie1 objects to the list
        m1.add(new Movie1("Spider Man", 8.8, 2014)); // Movie 1
        m1.add(new Movie1("Iron Man", 9.9, 2008));   // Movie 2
        m1.add(new Movie1("Bat Man", 8.9, 2006));    // Movie 3

        // Sort the movies list using the Year comparator (sorting by year)
        Collections.sort(m1, new Year());

        // Print the sorted movies list
        for (Movie1 movie : m1) {
            System.out.println("Movie Name: " + movie.getName() + ", Rating: " + movie.getRating() + ", Year: " + movie.getYear());
        }
    }
}