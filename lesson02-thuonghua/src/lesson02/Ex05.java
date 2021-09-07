package lesson02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap so can chuyen doi: ");
		int a = ip.nextInt();
		convert(a);
	}

	private static void convert(int a) {
		int array[] = new int[10];
		int c = 0;
		while (a > 0) {
			array[c++] = a % 2;
			a = a / 2;
		}

		for (int i = c - 1; i >= 0; i--) {
			System.out.print(array[i]);
		}
	}
}
