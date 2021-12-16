package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
	
	public static void main(String[] args) {
		// Raw type
		// Default: list of objects
		
		// Required: List of integers
		List salaries = new ArrayList();
		
		// Able to add any type: Integer, String, Double, Item
		salaries.add(new Integer(2000));
		salaries.add(new Integer(4000));
		salaries.add("10 trieu");
		
		// compile time >> no error
		// run time     >> java.lang.numberNumberFormatException: For input string: "10 trieu"
		
		// for each: JDK 1.5
		for(Object salary : salaries) {
			System.out.println(Integer.parseInt(salary.toString()) * 2);
		}
		
		// Problems
		// 1. Display warning message for raw type (no pass a parameter for List)
		// 2. Allow to add any type in List >>
		//	>> compile time will no show error
		//  >> appear the error at runtime >> hard to find the root cause
		// 3. Expect error at compile time
		
	}
}
