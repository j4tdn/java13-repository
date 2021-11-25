package exercises;

import java.util.Random;
import java.util.Scanner;

public class Training {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		input(numbers);
	}
	
	private static void input(int[] n) {
		int i = 0;
		
		do {
			boolean check = true;
			n[i] = new Random().nextInt(11) + 20;
			System.out.println("n[" + i + "]" + n[i]);
			for(int j = i - 1; j >= 0; j--) {
				if(n[j] == n[i]) {
					System.out.println("Try again");
					check = false;
				}
			}
			
			if(!check) {
				continue;
			}
			
			i++;
		} while(i < n.length);
	}
}
