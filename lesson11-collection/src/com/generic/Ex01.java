package com.generic;

public class Ex01 {
	public static void main(String[] args) {
		Integer[] numbers = { 1, 2, 3, 4, 5 };
		Double[] digits = { 6d, 7d, 8d, 9d, 10d };
		String[] months = {"JAN", "FEB", "MAR", "APR"};
		
		// worked with BOTH options
		
		printf(numbers);
		printf(digits);
		printf(months);
		
		printg(numbers);
		printg(digits);
		printg(months);
	}
	
	// Option 1: Idea of OOP >> Pass a sub type for parent parameter
	private static void printf(Object[] elements) {
		for (Object element: elements) {
			System.out.print(element + "  ");
		}
		System.out.println();
	}
	
	// Option 2: Idea of Generic
	// <Element>: declaration, any name E, T, M
	// Element: generic type, default: Element is an Object
	private static <Element> void printg(Element[] elements) {
		for (Element element: elements) {
			System.out.print(element + "  ");
		}
		System.out.println();
	}
}
