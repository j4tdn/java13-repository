package strategy;

import java.util.Arrays;
import java.util.List;

public class App {
	public static void main(String[] args) {
//		int a = 10;
//		int b = 5;
//		double sum = doCalculation(a, b, (x, y) -> x + y);
//		double sub = doCalculation(a, b, (x, y) -> x - y);
//		double mul = doCalculation(a, b, (x, y) -> x * y);
//		double div = doCalculation(a, b, (x, y) -> x / y);
//		double log = doCalculation(a, b, (x, y) -> Math.log(x) / Math.log(y));
//		System.out.println("sum: " + sum);
//		System.out.println("sub: " + sub);
//		System.out.println("mul: " + mul);
//		System.out.println("div: " + div);
//		System.out.println("log: " + log);

		int[] numbers = { 25, 12, 28, 84, 126, 60, 19, 30 };
		int[] lc5 = filter(numbers, x -> x % 5 == 0);
		int[] lc7and6 = filter(numbers, x -> x % 5 == 0 && x % 6 == 0);
		int[] primeNbrs = filter(numbers, x -> isPrime(x));

		System.out.println(Arrays.toString(lc5));
		System.out.println(Arrays.toString(lc7and6));
		System.out.println(Arrays.toString(primeNbrs));
	}

	private static boolean isPrime(int x) {
		if (x == 0 || x == 1)
			return false;
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int[] filter(int[] a, Requirement r) {
		int[] array = new int[a.length];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (r.check(a[i])) {
				array[count++] = a[i];
			}
		}
		return Arrays.copyOfRange(array, 0, count);
	}

}
