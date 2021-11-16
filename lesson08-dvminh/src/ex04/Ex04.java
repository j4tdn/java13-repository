package ex04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {
	private static int[] prime = {2, 3, 5, 7};
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a: ");
		int a = scanner.nextInt();
		System.out.println("Nhap b: ");
		int b = scanner.nextInt();
		
		System.out.println(isCheckCommonDivisor(commonDivisorPrime(a), commonDivisorPrime(b)));
	}
	
	private static int[] commonDivisorPrime(int number) {
		int[] digit = new int[prime.length];
		int count = 0;
		for (int i = 0; i < prime.length; i++) {
			if (number % prime[i] == 0) {
				digit[count++] = prime[i];
			}
		}
		return Arrays.copyOfRange(digit, 0, count);
	}
	
	private static boolean isCheckCommonDivisor(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
}
