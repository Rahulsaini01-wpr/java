package com.wipro.java.collection;

import java.util.HashMap;
import java.util.Map;

class MapCode {
    public static void main(String[] args) {
        // Creating a HashMap where Integer is the key  and String is the value
        Map<Integer, String> map = new HashMap<>();

        // 1. Adding key-value pairs to the map
        map.put(1, "Apple");
        map.put(2, "Pineapple");
        map.put(3, "Mango");
        

        // Accessing the values by key
        System.out.println("key 1: " + map.get(1));//Output: Apple
        System.out.println("key 2: " + map.get(2));//Output: Pineapple
        

        // Checking if a key exists in the map
        if (map.containsKey(3)) {
        	 System.out.println("Key 3 exists with values  " + map.get(3));//Output : Mango
        }
       
        // Iterating over the map using for-each loop
        System.out.println("\nIterating through the Map");
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
        	System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        
        //Removing a key-value pair
        map.remove(2); //Removes the key 2 ( and its associated value)
        
        //Displaying the map after removal
        System.out.println("\nMap after removal of key 2: ");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
