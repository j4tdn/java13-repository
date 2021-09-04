package io;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		Random rd = new Random();
		boolean isT = rd.nextBoolean();
		System.out.println("Left leg");
		
		//Integer. Min Value --> Integer. Max Value
		int nbr = rd.nextInt();
		System.out.println("number: " + nbr);
		
		//0 --> [bound -1]
		int dgt = rd.nextInt(22);
		System.out.println("number: " + dgt);
		
		//1 khoảng từ a --> b >> 22 --> 38
		//random a-b = a + rd.nextIn(b-a+1)
		int rgn = 22 + rd.nextInt(38-22+1);
		System.out.println("number: " + rgn);
		
		System.out.println("=================");
		
		//list of student >> array of digit
		
	}	
}