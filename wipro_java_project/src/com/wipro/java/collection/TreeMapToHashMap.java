package com.wipro.java.collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapToHashMap {
    public static void main(String[] args) {
        // Create and populate the TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");
        treeMap.put(3, "Cherry");
        treeMap.put(4, "Date");
        
        // Display the TreeMap
        System.out.println("Original TreeMap:");
        for (Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Create a HashMap and copy the data from the TreeMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.putAll(treeMap); // Copy all data from TreeMap to HashMap

        // Display the HashMap
        System.out.println("\nData copied to HashMap:");
        for (Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
