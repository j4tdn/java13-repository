package com.generic;

import java.util.Arrays;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> digits = Arrays.asList(6d, 7d, 8d, 9d);
		List<String> months = Arrays.asList("January", "February", "March", "April");
		List<Object> objects = Arrays.asList(new Object());
		
		// only WORKED with Option 2: Generic type
		
		// printf(numbers);
		// printf(digits);
		// printf(months);
		// printf(objects);
		
		printg(numbers);
		printg(digits);
		printg(months);
	}

	// Options 1: Idea of OOP >> Inheritance
	// Required Type: List<Object>
	// Object is parent of Integer, String, Double
	// List<Object> is NOT parent of List<Integer>, List<String>, List<Double>
	private static void printf(List<Object> elements) {
		for (Object element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}

	// Option 2: Idea of Generic >>
	// Extended: Allow to print number type: Integer, Double, Long, Float
	// Element "extends" Number
	// Elements is Number type or sub-type of Number
	
	// Element "extends" CharSequence
	// Elements is CharSequence type or sub-type of CharSequence
	private static <Element extends CharSequence> void printg(List<Element> elements) {
		for (Element element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	// Benefit
	// Pass an Object type
	// Restricted Object type with "extends" keyword
}
