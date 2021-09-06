package io;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		Random rd = new Random();
		
		boolean isT = rd.nextBoolean();
		System.out.println("isT: "+isT);
		
		int nbr = rd.nextInt();
		System.out.println("nbr: "+nbr);
		
		int dgt = rd.nextInt(13);
		System.out.println("nbr: "+dgt);
		
		//list of digit >> array of digit
		//each element >> digit >>int type
		//length = 5
		//first element >> index 0
		int[] digits = {26,23,18,67,49};
		
		//list od students >>array of student
		String[] students = {"Nam","Teo","Le","Hoang"};
		System.out.println("eo = "+students[0]);
		System.out.println("eo = "+students[2]);
		System.out.println("student length: "+students.length);
		
		String stdRdm = students[rd.nextInt(students.length)];
		System.out.println("stdRdm : "+stdRdm);
	}
}
