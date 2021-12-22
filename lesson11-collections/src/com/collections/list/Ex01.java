package com.collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * List ArrayList and raw type problems
 * JDK: 1.4
 */
public class Ex01 {
	public static void main(String[] args) {
		// raw type
		
		
		// required: list of integers
		List salaries = new ArrayList(); // default: list of objects
		
		// able to add any type: Integer, String, Double, Item
		salaries.add(new Integer(2000));
		salaries.add(new Integer(4000));
		salaries.add("wrong_type"); 
		
		// compile time >> no error
		// runtime      >> java.lang.NumberFormatException: For input string: "wrong_type"
		
		// for each : JDK 1.5
		for (Object salary: salaries) {
			System.out.println(Integer.parseInt(salary.toString()) * 2);
		}
		
		// Problems
		// 1. Display warning message for raw type(no pass a parameter for List)
		// 2. Allow to add any type in List >>
		//    >> compile time will no show error
		//    >> appear the error at runtime >> hard to find the root cause
		// 3. Expect error at compile time
	}
}
