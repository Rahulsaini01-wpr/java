package com.wipro.java.collection;

/**
 * This class demonstrates how to use different collections in Java
 * without explicit imports, using Integer values in List and LinkedList,
 * and String values in HashMap.
 */

import java.util.*;
public class Collection {
    public static void main(String[] args) {
        
        // 1. Using an Array (Fixed size)
        System.out.println("Array Example:");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println(); // Blank line for separation

        // 2. Using an ArrayList (Dynamic size) with Integer values
        System.out.println("ArrayList Example:");
        List<Integer> numberList = new ArrayList<>();
        numberList.add(100);
        numberList.add(200);
        numberList.add(300);
        for (int num : numberList) {
            System.out.println(num);
        }
        System.out.println("First element in the ArrayList: " + numberList.get(0));

        System.out.println(); // Blank line for separation

        // 3. Using a LinkedList with Integer values
        System.out.println("LinkedList Example:");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(15);
        linkedList.add(25);
        for (int num : linkedList) {
            System.out.println(num);
        }
        
        linkedList.addFirst(1);
        
        // Printing the updated LinkedList
        System.out.println("Updated LinkedList after adding 1 at the start:");
        for (int num : linkedList) {
            System.out.println(num);
        }

        System.out.println(); // Blank line for separation

        // 4. Using a HashMap with Integer keys and String values
        System.out.println("HashMap Example:");
        Map<Integer, String> fruitMap = new HashMap<>();
        fruitMap.put(1, "Apple");
        fruitMap.put(2, "Pineapple");
        fruitMap.put(3, "Guava");
        System.out.println("Complete Map: " + fruitMap);
        System.out.println("Value for key : " + fruitMap.get(2));
        
        
        fruitMap.remove(3);//Removed the third element
        System.out.println("Map after removing key : " + fruitMap);

        System.out.println(); // Blank line for separation
    }
}
