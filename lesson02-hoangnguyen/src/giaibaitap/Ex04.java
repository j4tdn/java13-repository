package giaibaitap;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] array = {2, 4, 6, 8, 11, 19};
		System.out.println(maxOdd(array));

	}
	
	private static int maxOdd(int[] array) {
		int[] oddNumbers = oddNumbers(array);
		if(oddNumbers == null) {
			return 0;
		}
		
		int max = Integer.MIN_VALUE;
		for(int number : oddNumbers) {
			if(number > max) {
				max = number;
			}
		}
		
		return max;
	}
	
	private static int[] oddNumbers(int[] array) {
		if(array.length == 0) {
			System.out.println("An array is empty");
			return null;
		}
		
		int[] oddNumbers = new int[array.length];
		int count = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 != 0) {
				oddNumbers[i] = array[i];
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println("Do not have odd number in array");
			return null;
		}
		
		return oddNumbers;
	}
}
