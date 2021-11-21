package ex03;

/**
 * 
 * Cho mảng A gồm n phần tử (2 < n < 20). Ak = [1, 10] Tìm bội chung nhỏ nhất
 * của các phần tử trong mảng  VD1: Ak = [2, 3] >> BCNN = 6  VD2: Ak = [2, 3,
 * 4] >> BCNN = 12
 *
 */
public class App {
	
	public static void main(String[] args) {
		int [] numbers = {2, 3, 4, 6, 8};
		int result = bcnn(numbers);
		System.out.println("BCNN: " + result);
	}
	
	// >> BCNN (a, b) = a * b // UCLN(a, b)
	// BCNN: LEAST COMMON MULTIPLE
	// UCLN: GREATEST COMMON MULTIPLE
	private static int bcnn(int[] numbers) {
		int length = numbers.length;
		if(length == 0) return Integer.MIN_VALUE;
		if(length == 1) return numbers[0];
		int a = numbers[0];
		int b = numbers[1];
		int result = bcnn(a, b);
		if(numbers.length > 2) {
			for(int i = 2; i < numbers.length; i++) {
				result = bcnn(result, numbers[i]);
			}
		}
		
		return result;
	}
	
	private static int bcnn(int a, int b) {
		return a * b / ucln(a, b);
	}
	
	private static int ucln(int a, int b) {
		while(a != b) {
			if(a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		
		return a;
	}
}
