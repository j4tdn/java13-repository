package com.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02 {
	
	public static void main(String[] args) {
		// get, set, add, remove, show
		List<Integer> numbers = new ArrayList<>();
		// returned dynamic arraylist
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		System.out.println("numbers size: " + numbers.size());
		
		// get, set, show
		List<Integer> digits = Arrays.asList(1,2,3,4,5);
		// restricted: returned fixed-arraylist
		System.out.println("digits size: " + digits.size());
	}
}
