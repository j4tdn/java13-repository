package strategy;

import java.util.Arrays;

/**
 * 1. Cho 2 số nguyên a, b
 * Viết chương trình thực hiện các thao tác sau đây
 * + Tính tổng
 * + Tính hiệu
 * + Tính tích
 * + Tính thương
 * + Tính log(a)/log(b)
 * 
 * 2. Cho dãy số nguyên không âm gồm N chữ số
 * Viết chương trình thực hiện các thao tác sau đây
 * + Tìm danh sách các số là bội của 5
 * + Tìm danh sách các số là bội của 7 và 6
 * + Tìm danh sách các số là số nguyên tố
 */
public class App {
	public static void main(String[] args) {
		int[] numbers = {25, 12, 28, 84, 126, 60, 19, 30};
		int[] lc5 = get(numbers, x -> x % 5 == 0);
		int[] lc7And6 = get(numbers, x -> x % 7 == 0 && x % 6 == 0);
		int[] primeNbrs = get(numbers, x -> isPrime(x));
		
		System.out.println(Arrays.toString(lc5));
		System.out.println("\n=========\\\\\\\\===========\n");
		System.out.println(Arrays.toString(lc7And6));
		System.out.println("\n=========\\\\\\\\===========\n");
		System.out.println(Arrays.toString(primeNbrs));
		
		System.out.println("\n=========\\\\\\\\===========\n");
		int sum = operate(10, 4, (a, b) -> a + b);
		int sub = operate(12, 4, (a, b) -> a - b);
		int mul = operate(14, 4, (a, b) -> a * b);
		int log = operate(14, 4, (a, b) -> (int)Math.log(a) / (int)Math.log(b));
		
		System.out.println("sum: " + sum);
		System.out.println("sub: " + sub);
		System.out.println("mul: " + mul);
		System.out.println("log: " + log);
	}
	
	public static int[] get(int[] numbers, Strategy strategy) {
		int[] result = new int[numbers.length];
		int i = 0;
		for (int number: numbers) {
			if (strategy.execute(number)) {
				result[i++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, i);
	}
	
	public static int operate(int a, int b, Calculator c) {
		return c.execute(a, b);
	}
	
	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
}
