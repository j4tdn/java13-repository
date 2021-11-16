package ex04;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int n1 = Integer.parseInt(sc.nextLine());
		System.out.println("Enter second number: ");
		int n2 = Integer.parseInt(sc.nextLine());
		if(isEquivalentPrimeNumber(n1, n2)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	private static boolean isEquivalentPrimeNumber(int n1, int n2) {
		return compare(isPrime(n1), isPrime(n2));
	}

	private static boolean compare(int[] n1, int[] n2) {
		if(n1.length != n2.length) {
			return false;
		}
		for(int i = 0; i < n1.length; i++) {
			if(n1[i] != n2[i]) {
				return false;
			}
		}
		
		return true;
	}

	private static int[] isPrime(int number) {
		int[] result = new int[number];
		int count = 0;
		
		for (int i = 2; i <= number; i++) {
			if (number % i == 0) {
				result[count++] = i;
			}

			while (number % i == 0) {
				number /= i;
			}
		}
		
		return Arrays.copyOfRange(result, 0 , count);
	}

}
