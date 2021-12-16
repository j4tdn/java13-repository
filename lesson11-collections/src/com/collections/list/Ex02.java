package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {
	
	public static void main(String[] args) {
		// Required: List<Integer> List<String>
		
		List<Integer> digits = new ArrayList<>();
		
		// HEAP: Normal || Constant Pool
		digits.add(11);
		digits.add(22);
		digits.add(36);
		
		// digits.add("10 trieu"); mandatory is Integer
		
		// Error at compile time
		for (Integer digit: digits) {
			System.out.println(digit * 2);
		}
		
		System.out.println("\n\\\\\\\\==========================\\\\\\\\\n");
		
		List<String> students = new ArrayList<>();
		students.add("John Smith");
		students.add("Lionel Messi");
		students.add("Xavi");
		
		for(String student: students) {
			System.out.println(student);
		}
	}
}
