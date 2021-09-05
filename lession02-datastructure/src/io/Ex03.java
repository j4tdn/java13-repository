package io;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		Random rd = new Random();
		String value = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10); 
		System.out.println(value);
	}
}
