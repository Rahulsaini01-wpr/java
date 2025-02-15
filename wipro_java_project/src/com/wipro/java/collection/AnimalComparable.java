package com.wipro.java.collection;

import java.util.*;

public class AnimalComparable implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        return Integer.compare(a1.getAge(), a2.getAge()); // Compare by age
    }
}
