package io;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		//random 1 số từ 000-999
		Random rd = new Random();
		String value = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
		System.out.println(value);
		
	}
}
