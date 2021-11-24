package strategy;

import java.util.Arrays;

/**
 * 
 * cho 2 số nguyên dương a,b
 * Viết cương trình thực hiện thao tacsau
 * tính tổng
 * tính hiệu
 * tính tich
 * tính thương
 * tính log(a)/log(b)
 *
 */
public class App {
	public static void main(String[] args) {
//		int sum = operate(10, 4,(a,b) -> a + b);
		int[] numbers = {25, 12, 28, 84, 126, 60, 19, 30};
		int [] b5 = getList(numbers, number -> number % 5 == 0);
		System.out.println(Arrays.toString(b5));
		int [] b76 = getList(numbers, number -> number % 7 == 0 && number % 6 == 0);
		System.out.println(Arrays.toString(b76));
		int [] prime = getList(numbers, number -> isPrime(number));
		System.out.println(Arrays.toString(prime));
	}
	
//	public static int operate(int a, int b, Condition c) {
//		return c.execute(a,b);
//	}
	
	public static int[] getList(int [] numbers, Condition condition) {
		int[] result = new int[numbers.length];
		int index = 0;
		for(int number: numbers) {
			if(condition.execute(number)) {
				result[index++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}
	
	public static boolean isPrime(int a) {
		if ( a < 2 ) return false;
		for(int i = 2; i<= Math.sqrt(a); i++) {
			if(a % i == 0) return false;
		}
		return true;
	}
}
