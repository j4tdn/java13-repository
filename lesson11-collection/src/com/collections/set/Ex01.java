package com.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {
	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>();
		numbers.add(12); 
		numbers.add(8); 
		numbers.add(6); 
		numbers.add(40); 
		numbers.add(26);
		
		numbers.add(12);
		
		System.out.println("size : " + numbers.size());
		System.out.println("elements : " + numbers);
	}
}
