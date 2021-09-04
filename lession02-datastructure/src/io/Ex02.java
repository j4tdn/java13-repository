package io;

import java.util.Random;

public class Ex02 {
	
	public static void main(String[] args) {
		Random rd = new Random();
		
		boolean isLeft = rd.nextBoolean();
		System.out.println("isLeft: " + isLeft);
		
		// 0 => [bound -1]
		int nbr = rd.nextInt(22);
		System.out.println("nbr: " + nbr);
		
		
		// a -> b >> 22[inclusive] -> 38[inclusive]
		int range = rd.nextInt(38 - 22 + 1) + 22;
		System.out.println("range: " + range);
		// random(a, b) = nextInt(b - a + 1) + a;
		
		// list of students >> array of digit
		// each element >> digit >> int type
		int[] digits = {24, 23, 52, 51, 62};
		
		
		//list of students >> array of student
		// length = 4
		// first element >> index 0 >> "Nam"
		String[] students = {"Roll", "Teo", "Le", "Man"};
		System.out.println("e0 = " + students[0]);
		System.out.println("e2 = " + students[2]);
		System.out.println("students length: " + students.length);
		
		System.out.println("Random student: " + students[rd.nextInt(students.length)]);
		
	}
}
