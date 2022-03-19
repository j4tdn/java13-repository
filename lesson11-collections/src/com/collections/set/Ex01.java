package com.collections.set;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>();
		//Set<Integer> numbers = new LinkedHashSet<>();
		//Set<Integer> numbers = new TreeSet<>();
		numbers.add(12);
		numbers.add(12);
		numbers.add(8);
		numbers.add(6);
		numbers.add(40);
		numbers.add(26);

		System.out.println("size: " + numbers.size());
		System.out.println("elements: " + numbers);
	}
}
