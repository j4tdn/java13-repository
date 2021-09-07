package Exercise;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		System.out.println("Prime 200st : " + findPrime200St());
	}
	
	public static boolean isPrime(int n) {
		if (n <= 1) return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) return false;
		}
		return true;
	}
	
	public static int findPrime200St() {
		int dem = 0;
		int n = 0;
		while (dem != 200) {
			if (isPrime(n++)) dem++;
		}
		return n - 1;
	}
}
