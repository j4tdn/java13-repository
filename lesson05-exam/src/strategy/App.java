package strategy;

import java.util.Arrays;

/*
 * Cho 2 số nguyên a và b
 * Viết chương trình thực hiện các thao tác sau đây
 * 
 */

public class App {
	public static void main(String[] args) {
		int[] numbers = {25, 12, 28, 84, 126, 60, 19, 30};
		
		System.out.println("\n===========\\\\\\\\\\=============\n");
		Condition lc5 = number -> number % 5 == 0;
		Condition lcm6and7 = number -> number % 42 == 0;
		Condition prime = number -> isPrime(number);
		
		System.out.println("Input: " + Arrays.toString(numbers));
		System.out.println("LCM of 5: " + Arrays.toString(get(numbers, lc5)));
		System.out.println("LCM of 6 & 7: " + Arrays.toString(get(numbers, lcm6and7)));
		System.out.println("Prime: " + Arrays.toString(get(numbers, prime)));
		
//		Calculator sum = (a, b) -> a + b;
//		Calculator sub = (a, b) -> a - b;
//		Calculator mul = (a, b) -> a * b;
//		Calculator div = (a, b) -> a / b;
//		Calculator log = (a, b) -> (int)Math.log(a) / (int)Math.log(b);
//		
//		System.out.println("Sum: " + Operation(3, 5, sum));
//		System.out.println("Sub: " + Operation(3, 5, sub));
//		System.out.println("Mul: " + Operation(3, 5, mul));
//		System.out.println("Div: " + Operation(3, 5, div));
//		System.out.println("Log: " + Operation(3, 5, log));
	}
	
//	private static int Operation(int a, int b, Calculator math) {
//		return math.operate(a, b);
//	}
	
	private static int[] get(int[] numbers, Condition condition) {
		int[] result = new int[numbers.length];
		int index = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (condition.check(numbers[i]))
				result[index++] = numbers[i];
		}
		return Arrays.copyOfRange(result, 0, index);
	}
	
	private static boolean isPrime(int number) {
		if (number == 0 || number == 1) return false;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) return false;
		}
		return true;
	}
}
