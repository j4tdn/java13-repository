package io;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		Random rd = new Random();
		
		//Integer>MIN_VALUE -> Integer.MAX_VALUE
		int nbr = rd.nextInt();
		System.out.println("inT: " + nbr);
		
		// 0 -> [bound -1]
		int dgt = rd.nextInt(22);
		System.out.println("dgt: " + dgt);
		
		// a-> b >> 22[inclusive] -> 38[inclusive]
		int rgn = 22 + rd.nextInt(38-22);
		System.out.println("rgn: " + rgn);
		
		// random(a,b) = a + nextInt(b - a + 1)
		
		// list of digits >> array of digit
		// each element >> digit >> int type
		// length
		// first element >> index 0
		int[] digits = {26, 23, 18, 67, 49};
		
		// list of students >> array of student
		// length = 4
		// first element >> index 0 >> "Nam"
		String[] students = {"Nam", "Teo", "Le", "Hoang"};
		System.out.println("e0 = " + students[0]);
		System.out.println("e2 = " + students[2]);
		System.out.println("students length: " + students.length);
		
		String stdRdm = students[rd.nextInt(students.length)];
		System.out.println("stdRdm: " + stdRdm);
	}

}
