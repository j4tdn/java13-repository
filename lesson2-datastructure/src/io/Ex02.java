package io;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
Random rd = new Random();
		
		boolean isT = rd.nextBoolean();
		System.out.println("isT: " + isT);
		
		int nbr = rd.nextInt();
		System.out.println("nbr: " + nbr);
		
		// 0 -> [bound -1]
		int dgt = rd.nextInt(22);
		System.out.println("dgt: " + dgt);
		
		// a -> b >> 22[inclusive] -> 38[inclusive]
		// rd.nextInt(38-22+1) >> nextInt(17) >> [0-16]
		int rgn = 22 + rd.nextInt(38-22+1); // 22 + [0-16]
		System.out.println("rgn: " + rgn);
		// random(a, b) = a + nextInt(b-a+1)
		
		System.out.println("===================");
		
		// length=5
		// first element >> index 0 >> 26
		int[] digits = {26, 23, 18, 67, 49};
		int dgtRdm = digits[rd.nextInt(digits.length)];
		System.out.println("dgtRdm: " + dgtRdm);
		
	
		String[] students = {"ahihi", "ahihe", "ahuhu", "ahehe"};
		System.out.println("s0 = " + students[0]);
		System.out.println("s2 = " + students[2]);
		System.out.println("students length: " + students.length);
		
		String stdRdm = students[rd.nextInt(students.length)];
		System.out.println("stdRdm: " + stdRdm);
				
	}
}
