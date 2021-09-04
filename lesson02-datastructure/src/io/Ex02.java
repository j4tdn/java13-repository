package io;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		Random rd = new Random();
		boolean isT = rd.nextBoolean();
		if(isT) {
			System.out.println("Danh");
		}
		
		if(!isT) {
			System.out.println("Khong Danh");
		}
		
		int nbr = rd.nextInt();
		System.out.println("nbr: " + nbr);
		
		int dgt = rd.nextInt(22);
		System.out.println("dgt: " + dgt);
		// in tu 22 -> 38
		int rgn = 22 + rd.nextInt(38-22+1);
		
		//list of digits >>array of digit
		int[] digits = {26, 23, 18, 67, 49};
		//list student >>array of student
		String[] students = {"Nam", "Teo", "Le", "Hoang"};
		System.out.println("e0 = " + students[0]);
		System.out.println("e2 = " + students[2]);
		System.out.println("students length: " +students.length);
		
		String stdRdm = students[rd.nextInt(students.length)];
		
		System.out.println("stdRdm: " + stdRdm);
	}
}
