package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>();
		numbers.add(12);
		numbers.add(8);
		numbers.add(6);
		numbers.add(1);
		numbers.add(40);
		
		System.out.println("size: " + numbers.size());
	}
}
