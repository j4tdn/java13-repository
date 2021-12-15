package com.collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * List ArrayList with Single Object Type - Integer, String
 * JDK: 1.5 1.7
 */
public class Ex02 {
	public static void main(String[] args) {
		// Required: List<Integer> List<String>
		
		List<Integer> digits = new ArrayList<Integer>();
		
		digits.add(10);
		digits.add(20);
		digits.add(36);
		
		for(Integer digit: digits) {
			System.out.println(digit * 2);
		}
		
		System.out.println("\n\\\\\\\\=============\\\\\\\\\n");
		
		List<String> students = new ArrayList<String>();
		students.add("John smith");
		students.add("Rivadol");
		
		for(String student: students) {
			System.out.println(student);
		}
	}
}
