package strategy;

import java.util.Arrays;

/*
 *1. Cho 2 số nguyên dương a, b
 * Viết chương trình thực hiện:
 * + tính tổng
 * + tính  hiệu
 * + tính tích
 * + tính thương
 * + tính log(a)/log(b)
 * 
 *2. Cho dãy số nguyên không âm gồm N chữ số
 *Viết chương trình thực hiện các thao tác sau đây
 * + Tìm danh sách các số là bội của 5
 * + Tìm danh sách các số là bội của 7 và 6
 * + Tìm danh sách các số là số nguyên tố
 */
public class App {
	public static void main(String[] args) {
		int[] arr = {25, 12, 28, 84, 126, 60, 19, 30};
		
	
		int[] lc5 = get(arr, x -> x % 5 == 0);
		System.out.println(Arrays.toString(lc5));
		int[] lc67 = get(arr, x -> x % 6 == 0 && x % 7 == 0);
		System.out.println(Arrays.toString(lc67));
 		int[] pn = get(arr, x -> isPrime(x));
 		System.out.println(Arrays.toString(pn));
 				
		System.out.println("==========");
		operate(10, 4, (a, b) -> a + b);
		operate(12, 4, (a, b) -> a - b);
		operate(3, 4, (a, b) -> a * b);
		operate(10, 4, (a, b) -> a / b);
		
		System.out.println(operate(10, 4, (a, b) -> a + b));

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
	
	private static int[] get(int[] arr, GetNumber g) {
		int[] result = new int[arr.length];
		int index = 0;
		for(int i: arr) {
			if(g.check(i)) {
				result[index++] = i;
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}
	private static int operate(int a, int b, Calculator c) {
		return c.execute(a, b);
	}
	
	
}
