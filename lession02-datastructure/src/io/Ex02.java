package io;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		Random rd = new Random();
		boolean isT = rd.nextBoolean();
		
		int nbr = rd.nextInt();
		System.out.println("nrb : " + nbr);
		
		int dgt = rd.nextInt(22);
		System.out.println("dgt: " + dgt);
		
		int rgn = 22 + rd.nextInt(38-22+1);
		System.out.println("rgn" +rgn);
		
		int[] digits = {1, 2, 3, 4, 5};
		String[] students = {"Nam", "Teo", "Le", "Hoang"};
		System.out.println("e0 = " + students[0]);
		System.out.println("student length : " + students.length);
		
		String stdRdm = students[rd.nextInt(students.length)];
		System.out.println("stdRdm : " +stdRdm);
	}
}
