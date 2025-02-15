package com.wipro.java.collection;

import java.util.*;

public class AnimalComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.getName().compareTo(a2.getName()); // Compare by name alphabetically
    }
}
