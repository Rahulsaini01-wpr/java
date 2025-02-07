package com.wipro.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) { 
		List<String> list = Arrays.asList("Swati", "Rahul", "Pratik");
		List<String> stream = list.stream().
				filter(name->name.startsWith("P")).
				collect(Collectors.toList());
		System.out.println(stream);
		
	
		List<String> stream1 = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(stream1);
		
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
		List<Integer> sortedNumbers = numbers.stream()
		   .sorted()
		   .collect(Collectors.toList());
		
		List<Integer> numbers1 = Arrays.asList(10, 20, 5, 25, 30);

		int min = numbers1.stream().min(Integer::compare).get();

		int max = numbers1.stream().max(Integer::compare).get();
		 
		System.out.println(numbers);
		System.out.println(numbers1);
		
		
	}
}
