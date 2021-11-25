package strategy;

import java.util.Arrays;

/**
 * 1. Cho hai số nguyên a, b
 * Viết trương trình thực hiện các thao tác sau đây
 * + Tính tổng
 * + Tính hiệu
 * + Tính tích
 * + Tính thương
 * + Tính log(a) / log(b)
 * 
 * 2. Cho dãy số nguyên không âm gồm n chữ số
 * Viết chương tình thực hiện các thao tác sau đây
 * + Tìm danh sách các số là bội của 5
 * + Tìm danh sách các số là bội của 7 và 6
 * + Tìm danh sách các số là số nguyên tố
 */
public class App {
	
	public static void main(String[] args) {
		int[] numbers = {25, 12, 28, 84, 126, 60, 19, 30};
		
//		Strategy st1 = number -> number % 5 == 0;
//		Strategy st2 = number -> number % 5 == 0 && number % 7 == 0;
//		Strategy st3 = number -> isPrime(number);
		
		System.out.println("st1: " + Arrays.toString(get(numbers, x -> x % 5 == 0)));
		System.out.println("st2: " + Arrays.toString(get(numbers, x -> x % 6 == 0 && x % 7 == 0)));
		System.out.println("st3: " + Arrays.toString(get(numbers, x -> isPrime(x))));
		System.out.println("\n==============\\\\\\\\\\\\===============\n");
		
		System.out.println("Tong: " + input(10, 4, (a, b) -> a + b));
		System.out.println("Hieu: " + input(10, 4, (a, b) -> a - b));
		System.out.println("Tich: " + input(10, 4, (a, b) -> a * b));
		System.out.println("Thuong: " + input(10, 4, (a, b) -> a / b));
		System.out.println("Log: " + input(10, 4, (a, b) -> Math.log(a) / Math.log(a)));
	}
	
	private static boolean isPrime(int n) {
		if(n == 0 || n == 1) return false;
		if(n % 2 == 0) return false;
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		
		return true;
	}
	
	private static int[] get(int[] numbers, Strategy strategy ) {
		int[] result = new int[numbers.length];
		int i = 0;
		for(int number : numbers) {
			if(strategy.execute(number)) {
				result[i++] = number;
			}
		}
		
		return Arrays.copyOfRange(result, 0, i);
	}
	
	private static double input(int a, int b, Calculator algorithm) {
		return algorithm.input(a, b);
	}
}
