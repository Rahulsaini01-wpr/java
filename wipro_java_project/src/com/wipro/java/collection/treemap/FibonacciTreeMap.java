package com.wipro.java.collection.treemap;

import java.util.Map;
import java.util.TreeMap;

public class FibonacciTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> fibonacciMap = new TreeMap<>();
        
        int n = 10; // Number of Fibonacci numbers to generate
        generateFibonacci(n, fibonacciMap);
        
        // Display the Fibonacci series stored in TreeMap
        System.out.println("Fibonacci Series stored in TreeMap:");
        for (Map.Entry<Integer, Integer> entry : fibonacciMap.entrySet()) {
            System.out.println("Index " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void generateFibonacci(int n, TreeMap<Integer, Integer> map) {
        int a = 0, b = 1;
        
        for (int i = 0; i < n; i++) {
            map.put(i, a);
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
