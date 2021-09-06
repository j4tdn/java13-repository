package lesson02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		oddmax();
	}
	private static void oddmax() {
		int n;
		int max = 0;
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		n = ip.nextInt();
		int [] array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter element array: ");
			array[i] = ip.nextInt();
			if (array[i] % 2 != 0 && array[i] > max)
				max = array[i];
		}
		
		System.out.println(max + " is odd max in list");
	}
}