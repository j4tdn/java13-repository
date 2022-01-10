package com.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class Ex01 {
	public static void main(String[] args) {
		Set<Integer> numbers = new TreeSet<>();
		numbers.add(12);
		numbers.add(8);
		numbers.add(6);
		numbers.add(40);
		numbers.add(26);
		
		System.out.println("numbers: " +numbers.size());
	}

}
