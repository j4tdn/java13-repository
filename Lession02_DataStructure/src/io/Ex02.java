package io;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		Random rd = new Random();
		
		//Integer.Min_Value -> Integer.MAX_VALUE
		int nbr = rd.nextInt();
		System.out.println("nbr: " + nbr);
		
		// 0 --. bound -1 {0;bound)
		int dgt = rd.nextInt(22);
		System.out.println("dgt: "+ dgt);
		// a--> b [a,b]
		int rgn = 22 + rd.nextInt(38-22+1);
		System.out.println("rgn: "+ rgn);
		// list of digits >> array of digits
		// each element = digits
		
		int [] digits = { 26,38,56,34};
		// list of students >> array of student
		//length = 4;
		String [] Student = {"Nam","Bac","Trung","Nam"};
		String stdRnd  = Student[rd.nextInt(Student.length)];
		System.out.println("stdRdm: "+ stdRnd);
				
	}
}
