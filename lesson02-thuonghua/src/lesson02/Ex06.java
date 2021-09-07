package lesson02;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {

		System.out.printf("So nguyen to thu 200 la: ");
		int temp = 0;
		int i = 2;
		while (temp < 200) {
			if (Prime(i)) {
				temp++;
			}
			i++;
		}
		System.out.print(i - 1);
	}

	public static boolean Prime(int n) {

		Double snt = Math.sqrt(n);
		for (int i = 2; i <= snt; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
