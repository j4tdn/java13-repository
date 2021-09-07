package view;

import java.util.Iterator;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		int n;
		int max = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input n:");
		n = sc.nextInt();
		int [] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("input number in array: ");
			numbers[i] = sc.nextInt();
			if (numbers[i] %2 != 0 && numbers[i]>max) {
				max = numbers[i];
			}
		}
		System.out.println("odd number max is:" + max);
	}
}
