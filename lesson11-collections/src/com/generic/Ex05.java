package com.generic;

import java.util.List;
import java.util.function.Predicate;

public class Ex05 {

	public static void main(String[] args) {
		IList<Integer> numbers = new CustomList<>();

		numbers.add(5);
		numbers.add(7);
		numbers.add(12);
		numbers.add(20);

//		int count = numbers.count(new Predicate<Integer>() {
//
//			@Override
//			public boolean test(Integer number) {
//				return number % 5 == 0;
//			}
//		});

		System.out.println("number of power of 5: " + numbers.count(number -> number % 5 == 0));
		
		// ListUtils.count(numbers, number -> number % 5 == 0);
		
		
	}
	
}
