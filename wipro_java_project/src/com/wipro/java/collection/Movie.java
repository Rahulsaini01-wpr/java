/**
 * This class demonstrates the use of Comparable interface to sort a collection of Movie objects.
 */
package com.wipro.java.collection;

// Import necessary classes for collection
import java.util.ArrayList;
import java.util.Collections;

/**
 * Movie class implements Comparable to allow sorting of movies based on their rating.
 */
public class Movie implements Comparable<Movie> {
    // Instance variables to store movie name, rating, and year
    private String n; // Movie name
    private double r; // Movie rating
    private int y;    // Movie year

    /**
     * Constructor to initialize a Movie object with name, rating, and year.
     *
     * @param n The name of the movie.
     * @param r The rating of the movie.
     * @param y The release year of the movie.
     */
    public Movie(String n, double r, int y) {
        this.n = n; // Set movie name
        this.y = y; // Set movie year
        this.r = r; // Set movie rating
    }

    /**
     * compareTo method from Comparable interface to define the sorting order.
     * This implementation sorts the movies based on their rating in ascending order.
     *
     * @param m The movie to be compared.
     * @return A negative value if the current movie's rating is less than the compared movie's rating,
     *         zero if they are equal, and a positive value if the current movie's rating is greater.
     */
    @Override
    public int compareTo(Movie m) {
        // Compare based on rating (in ascending order)
        return (int) (this.r - m.r); // Return difference of ratings, cast to int for sorting
    }

    // Getter method to retrieve the name of the movie
    public String getName() {
        return n;
    }

    // Getter method to retrieve the year of the movie
    public double getYear() {
        return y;
    }

    // Getter method to retrieve the rating of the movie
    public double getRating() {
        return r;
    }

    /**
     * Main method to test the functionality of the Movie class.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        // Create an ArrayList to hold Movie objects
        ArrayList<Movie> l = new ArrayList<>();

        // Add Movie objects to the list
        l.add(new Movie("Spider Man", 8.8, 2014)); // Movie 1
        l.add(new Movie("Iron Man", 9.9, 2008));   // Movie 2
        l.add(new Movie("Bat Man", 8.9, 2006));    // Movie 3

        // Sort the movies list using Comparable's compareTo method (sorting by rating in ascending order)
        Collections.sort(l);

        // Print the sorted movies list
        for (Movie movie : l) {
            System.out.println("Movie Name: " + movie.getName() + ", Rating: " + movie.getRating() + ", Year: " + movie.getYear());
        }
    }
}
