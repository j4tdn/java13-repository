package strategy;

import java.util.Arrays;

/**
 * 2. Cho dãy số nguyên không âm gồm N chữ số Viết chương trình thực hiện các
 * thao tác sau 
 * +Tìm danh sách các số là bội của 5 
 * +Tìm danh sách các số là bội của 7 và 6 
 * +Tìm danh sách các số là số nguyên tố
 */
public class App2 {
	public static void main(String[] args) {
		int [] numbers = {25, 12, 28, 84, 126, 60, 19,30 };
		int [] getNumber5 = get(numbers,  x ->x % 6 == 0);
		int [] getNumber76 = get(numbers,  x ->x % 7 == 0 && x % 6 == 0);
		int [] getIPrime = get(numbers,  x ->iPrime(x));
		
		System.out.println(Arrays.toString(getNumber5));
		System.out.println(Arrays.toString(getNumber76));
		System.out.println(Arrays.toString(getIPrime));

		

		
	}
	private static int [] get(int [] numbers, Condition c) {
		int [] result = new int [numbers.length];
		int i = 0;
		for(int number : numbers) {
			if(c.execute(number)) {
				result[i++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, i);
	}
	private static boolean iPrime(int n) {
		if( n == 0 || n ==1) return false;
		for(int i = 2; i <= Math.sqrt(n);i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
