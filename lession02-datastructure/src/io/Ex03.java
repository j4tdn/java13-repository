package io;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		
		//Random a number with 3 digits >> 000->999
		//e.g; 001 033 999
		while(true) {
		Random rd = new Random();
		String value = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
		System.out.println(value);
		}

	}

}
