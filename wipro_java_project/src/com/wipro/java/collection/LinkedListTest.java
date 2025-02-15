package com.wipro.java.collection;

import java.util.LinkedList;
import java.util.List;

class LinkedListTest {
    public static void main(String[] args) {
        int n = 5;

        List<Integer> l1 = new LinkedList<>();

        // Adding elements to the list
        for (int i = 1; i <= n; i++) {
            l1.add(i);
        }

        // Printing elements
        System.out.println("Original List: " + l1);

        // Remove element at index 3 (4th element)
        if (l1.size() > 3) { // Prevent IndexOutOfBoundsException
            l1.remove(3);
        }

        // Displaying the list after deletion
        System.out.println("After Removing Index 3: " + l1);

        // Printing elements one by one
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }
    }
}
