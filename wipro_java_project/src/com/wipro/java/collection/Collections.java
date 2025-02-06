package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class demonstrates how to use different collections in Java.
 * The collections include Array, List, LinkedList, and HashMap.
 */
public class Collections {

    /**
     * The main method where the collection examples will be demonstrated.
     * @param args Command line arguments (not used in this case).
     */
    public static void main(String[] args) {
        
        // 1. Using an Array (Fixed size)
        // An array is a basic data structure that stores a fixed number of elements of the same type.
        System.out.println("Array Example:");
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        
        // Printing all elements of the array
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        System.out.println(); // Blank line for separation

        // 2. Using an ArrayList (Dynamic size)
        // ArrayList is part of the List interface, which allows dynamic resizing.
        // You can add, remove, and access elements easily.
        System.out.println("ArrayList Example:");
        List<String> fruitList = new ArrayList<>();
        
        // Adding elements to the ArrayList
        fruitList.add("Mango");
        fruitList.add("Pineapple");
        fruitList.add("Grapes");
        
        // Printing the ArrayList
        for (String fruit : fruitList) {
            System.out.println(fruit);
        }

        // You can also get a specific element by its index:
        System.out.println("First element in the ArrayList: " + fruitList.get(0));
        
        System.out.println(); // Blank line for separation

        // 3. Using a LinkedList (Also dynamic, but with different internal implementation)
        // LinkedList is also a List, but it uses a different internal structure (linked nodes).
        // It is generally better for operations involving adding/removing elements from the middle.
        System.out.println("LinkedList Example:");
        LinkedList<String> linkedList = new LinkedList<>();
        
        // Adding elements to the LinkedList
        linkedList.add("Peach");
        linkedList.add("Papaya");
        linkedList.add("Plum");
        
        // Printing the LinkedList
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // Adding an element at the start of the LinkedList:
        linkedList.addFirst("Strawberry");
        System.out.println("First element after adding Strawberry: " + linkedList.getFirst());

        System.out.println(); // Blank line for separation

        // 4. Using a HashMap (Key-Value pair collection)
        // HashMap stores data in key-value pairs, where each key is unique.
        // You can retrieve, add, or remove data based on the key.
        System.out.println("HashMap Example:");
        Map<Integer, String> fruitMap = new HashMap<>();
        
        // Adding key-value pairs (key is an ID, value is the fruit name)
        fruitMap.put(1, "Apple");
        fruitMap.put(2, "Banana");
        fruitMap.put(3, "Cherry");

        // Printing the HashMap
        System.out.println("Complete Map: " + fruitMap);
        
        // Retrieving a value based on key:
        System.out.println("Value for key 2: " + fruitMap.get(2));

        // Removing an entry by key:
        fruitMap.remove(3); // Removes "Cherry"
        System.out.println("Map after removing key 3: " + fruitMap);

        System.out.println(); // Blank line for separation
    }
}
