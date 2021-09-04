package io;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		//random a number with 3 dight >> 000 --> 999
		//e.g 004, 354, 009, 676, 887
		Random rd = new Random();
		String nbr = "" + rd.nextInt(10)+ rd.nextInt(10) + rd.nextInt(10);
		System.out.println("number: " + nbr);
		
		
		
		
		//list is digit >> array of digit
		//each element >> digit >> int type
		//lenght = 5 
		//first element >> index 0 >> 26
		int [] digits = {26,23,18,67,49};
		System.out.println("e0:" + digits[0]);
		int number = digits[rd.nextInt(digits.length)];
		System.out.println(number);
		//list is student >> array of student
		//each element >> digit > int type
		//length = 5
		String[] students = {"vu","viet","anh","le","hoang","huyen","trang"};
		System.out.println(students.length);
		String stdRd = students[rd.nextInt(students.length)];
		System.out.println(stdRd);
		//random is digit 45 -- 90
		int rdNbr = 45 + rd.nextInt(90-45+1);
		System.out.println(rdNbr);
		
		
		
		
	}
	
	
}
