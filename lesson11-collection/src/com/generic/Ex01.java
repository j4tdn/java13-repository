package com.generic;

public class Ex01 {
	public static void main(String[] args) {
		Integer[] digits = {1, 2, 3, 4, 5};
		Double[] element = {4d, 5d, 6d, 7d};
		String[] month = {"JAN", "FEB", "MAR", "APR"};
		prinf(digits);
		prinf(element);
		prinf(month);
		System.out.println("=========================");
		prinfg(digits);
		prinfg(element);
		prinfg(month);
	}
	
	//Opt1: OOP
	public static void prinf(Object[] elements) {
		for(Object element:elements) {
			System.out.println(element);
		}
		System.out.println();
	}
	// Opt2: generic
	public static <Element>void prinfg(Element[] elements) {
		for(Element element:elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
}
