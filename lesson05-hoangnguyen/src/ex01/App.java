package ex01;
/**
 * 
 * Viết hàm kiểm tra một số (a) có phải là lũy thừa của một số khác (b) kkhông
 *
 */
public class App {
	
	public static void main(String[] args) {
		// n = log(b) / log(a) .> power(a, n) = b;
		
		int a = 2;
		int b = 8;
		boolean isPower = isPowerOf(a, b);
		System.out.println("isPower: " + isPower);
		
	}
	
	private static boolean isPowerOf(int a, int b) {
		double n = a > b ? Math.log(a) / Math.log(b) : Math.log(b) / Math.log(a);
		System.out.println("n = " + n);
		return Math.ceil(n) == Math.floor(n);
		
	}
}
