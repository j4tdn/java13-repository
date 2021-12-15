package com.collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * // heap: normal || constant pool
 * List ArrayList with Single Object Type – Integer, String
 * 
 * JDK 1.5 1.7
 * 
 * JDK 1.5
 * Boxing, UnBoxing, AutoBoxing
 * int - Integer
 * float - Float
 * double - Double
 * long - Long
 * 
 * int a = 10;
   Integer b = 20;
		
   // AutoBoxing, AutoUnBoxing
   a = b;
   b = a;
 *
 */
public class Ex02 {
	public static void main(String[] args) {
		// Required: List<Integer> List<String>
		
		List<Integer> digits = new ArrayList<>();
		
		digits.add(14);
		digits.add(22);
		digits.add(36);
		
		// digits.add("10 triệu"); mandatory is Integer
		
		// error at compile time
		
		for (Integer digit: digits) {
			System.out.println(digit * 2);
		}
		
		System.out.println("\n\\\\\\\\==================\\\\\\\\\n");
		
		
		List<String> students = new ArrayList<>();
		students.add("John smith");
		students.add("Rivaldo");
		
		for (String student: students) {
			System.out.println(student);
		}
	}
}
