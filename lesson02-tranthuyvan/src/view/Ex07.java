package view;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		Random rd = new Random();		
		for (int i = 0; i < 5; i++) {
			int num = 20 + rd.nextInt(30 - 20 + 1);
			System.out.println(num);
		}	
	}
}
