package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<>(); // List 1 that will perform operations
		List<Integer> l2 = new ArrayList<>(); // List 2 that will be used in addAll operation

		
		
		l1.add(10);
		l1.add(20);
        l1.add(30);
        l2.add(40);
        l2.add(50);
       
        // 1. Using addAll() to add elements from l2 into l1 at a specific index
       // This will insert all elements of l2 at index 1 in l1, pushing the existing elements after that index
        
        l1.addAll(1,l2);
        System.out.println("After addAll(l1,l2): " + l1);
        // l1 should now be: [10, 40, 50, 20, 30]
        
        // 2. Using remove() to remove the element at index 1
        // This will remove the element at index 1 in l1. In our case, it removes 40.
        l1.remove(1);
        System.out.println("After remove(1): " + l1);
        // l1 should now be: [10, 50, 20, 30]

        // 3. Using set() to update the element at index 0
        // This will replace the element at index 0 (which is 10) with the value 5.
        l1.set(0, 5);
        System.out.println("After set(0, 5): " + l1);
        // l1 should now be: [5, 50, 20, 30]
        
        
        
        
        
        
	}

}
