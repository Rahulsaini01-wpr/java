/**
 * 
 */
package com.wipro.java.collection;

import java.util.HashMap;
import java.util.Map;

class MapImplementation {
    public static void main(String[] args) {
        // 1. Creating a HashMap to store Integer keys and String values
        HashMap<Integer, String> map = new HashMap<>();

        // 2. Adding key-value pairs to the HashMap using put() method
        // Adding fruit names with their respective IDs
        map.put(101, "Mango");        // Mango with ID 101
        map.put(102, "Pineapple");    // Pineapple with ID 102
        map.put(103, "Grapes");       // Grapes with ID 103
        map.put(104, "Peach");        // Peach with ID 104
        map.put(105, "Plum");         // Plum with ID 105

        // 3. Printing the HashMap to see the contents after insertion
        System.out.println("Initial HashMap (After Insertions): " + map);

        // 4. Retrieving a value by its key using the get() method
        // Let's get the fruit name associated with key 103 (Grapes)
        int keyToGet = 103;
        System.out.println("Value at key " + keyToGet + ": " + map.get(keyToGet));

        // 5. Removing an entry from the HashMap using remove() method
        // We will remove the fruit with key 104 (Peach)
        int keyToRemove = 104;
        map.remove(keyToRemove);
        System.out.println("HashMap after removing key " + keyToRemove + " (Peach): " + map);

        // 6. Iterating over the HashMap using entrySet() to print all entries
        System.out.println("Iterating over the HashMap to display all key-value pairs:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            // Printing each key and its associated value
            System.out.println("Key: " + entry.getKey() + " -> Value: " + entry.getValue());
        }

        // 7. Checking if a specific key exists in the map using containsKey()
        int keyToCheck = 102;
        if (map.containsKey(keyToCheck)) {
            System.out.println("The map contains the key " + keyToCheck + ": " + map.get(keyToCheck));
        } else {
            System.out.println("The map does NOT contain the key " + keyToCheck);
        }

        // 8. Checking if a specific value exists in the map using containsValue()
        String valueToCheck = "Mango";
        if (map.containsValue(valueToCheck)) {
            System.out.println("The map contains the value \"" + valueToCheck + "\"");
        } else {
            System.out.println("The map does NOT contain the value \"" + valueToCheck + "\"");
        }

        // 9. Clearing all entries from the map
        map.clear();
        System.out.println("HashMap after clearing all entries: " + map);
    }
}
