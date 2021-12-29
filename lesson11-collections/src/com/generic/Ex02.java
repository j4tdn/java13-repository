package com.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		// get, set, add, remove, show
		List<Integer> numbers = new ArrayList<>();
		// returned dynamic-array list
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		// numbers.add(5);
		System.out.println("numbers: " + numbers);
		
		// get, set, show
		List<Integer> digits = Arrays.asList(1,2,3,4);
		// restricted: returned fixed-array list
		digits.add(5);
		System.out.println("digits: " + digits);
	}
}