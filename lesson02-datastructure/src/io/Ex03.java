package io;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		// Random a number with 3 digits ?? 000 - 999
		// E.g: 001 070 920 049 189 700
		
		// 1 + 2 >> 3 >> 
		//"" + 1 >> "1" + 2 >> 12
		
		Random rd = new Random();
		String value = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
		System.out.println(value);
	}

	
	
}
