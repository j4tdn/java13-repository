package ex04;

import java.util.Arrays;

/**
 * Bài 4: Số nguyên tố tương đương
Hai số tự nhiên được gọi là nguyên tố tương đương nếu chúng có chung các ước
số nguyên tố.
 */
public class Ex04 {
	public static void main(String[] args) {
		System.out.println(isEquivalentPrimeNumber(15, 75));
		System.out.println(isEquivalentPrimeNumber(20, 60));
		System.out.println(isEquivalentPrimeNumber(8, 80));
	}
	
	private static boolean isEquivalentPrimeNumber(int a, int b) {
		return compare(factorialPrime(a), factorialPrime(b));
	}
	
	private static int[] factorialPrime(int number) {
		int[] result = new int[number];
		int count = 0;
		for(int i = 2; i <= number; i++) {
			if(number % i == 0) {
				if(number % i == 0) {
					result[count++] = i;
				}
				while(number % i == 0) {
					number /= i;
				}
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static boolean compare(int[] a, int[] b) {
		if(a.length != b.length) {
			return false;
		}
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
}
