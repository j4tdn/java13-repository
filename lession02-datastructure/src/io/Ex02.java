package io;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		Random rd = new Random();
		
		boolean isT = rd.nextBoolean();
		System.out.println("isT: " + isT);
		
		//INTEGER.MIN_VALUE -> INTEGER.MAX_VALUE
		int nbr = rd.nextInt();
		System.out.println("nbr: " + nbr);
		
		//[0, bound)
		int dgt = rd.nextInt(22);
		System.out.println("dgt: " + dgt);
		
		//[a,b]>>[22,38]
		//rd.nextInt(38-22+1) >> nextInt(17) >>[0,16]
		int rgn = 22 + rd.nextInt(38-22+1); //22+[0,16]
		System.out.println("rgn: " + rgn);
		//random(a,b) = a + nextInt(b-a+1)
		
		System.out.println("===========");
		
		//list of students >> array of student
		String[] students = {"nam", "bao", "chien", "dung"};
		String stdRan = students[rd.nextInt(students.length)];
		System.out.println("stdRan: " + stdRan);
	}

}
