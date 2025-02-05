package com.wipro.java.collection;

import java.util.LinkedList; // Importing LinkedList class from Java Collections Framework

public class LinkedListExample {

    public static void main(String[] args) {
        
        // Step 1: Create a LinkedList to store Integer elements
        LinkedList<Integer> ll = new LinkedList<>();
        
        // Step 2: Add elements to the LinkedList using a for loop
        // Adding integers from 1 to n (assuming n is 5 for example)
        int n = 5;
        for (int i = 1; i <= n; i++) {
            ll.add(i);  // Add elements to the LinkedList
        }
        
        // Step 3: Print the LinkedList after adding elements
        System.out.println("LinkedList after adding elements: " + ll);
        
        // Step 4: Remove an element from the LinkedList at index 3
        // The index 3 corresponds to the 4th element in the list (since index starts from 0)
        ll.remove(3);  // Remove the element at index 3
        
        // Step 5: Display the LinkedList after removing the element
        System.out.println("LinkedList after removing element at index 3: " + ll);
        
        // Step 6: Print each element of the LinkedList one by one using a for loop
        System.out.print("Elements in the LinkedList: ");
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");  // Get the element at index i and print it
        }
    }
}
