/**
 * This class demonstrates the use of Comparable interface to sort a collection of Movie objects.
 */
package com.wipro.java.collection;


/**
 * Movie class 
 */
public class Movie1{
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
    public Movie1(String n, double r, int y) {
        this.n = n; // Set movie name
        this.y = y; // Set movie year
        this.r = r; // Set movie rating
    }


    // Getter method to retrieve the name of the movie
    public String getName() {
        return n;
    }

    // Getter method to retrieve the year of the movie
    public int getYear() {
        return y;
    }

    // Getter method to retrieve the rating of the movie
    public double getRating() {
        return r;
    }

 
}
