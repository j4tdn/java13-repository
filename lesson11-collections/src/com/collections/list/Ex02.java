package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		List<Integer> digits = new ArrayList<>();
		
		digits.add(14);
		digits.add(22);
		digits.add(36);
		
		//digits.add("10 triệu") : mandatory is Integer
		
		//error at compile time
		
		for (Integer digit : digits) {
			System.out.println(digit * 2);
		}
		
		System.out.println("======================================");
		
		List<String> students = new ArrayList<>();
		
		students.add("john smith");
		students.add("Rivaldo");
		
		for ( String student : students) {
			System.out.println(student);
		}
	}
}
