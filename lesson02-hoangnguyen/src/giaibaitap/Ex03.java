package giaibaitap;

public class Ex03 {
	
	public static void main(String[] args) {
		
		System.out.println(isSymmetric(12321));
		System.out.println(isSymmetric("abdsf"));
	}
	
	private static boolean isSymmetric(String input) {
		
		for(int i = 0; i < input.length() / 2; i++) {
			if(input.charAt(i) != input.charAt(input.length() - i - 1)) {
				return false;
			}
		}
		
		// == > COMPARE 2 VALUES AT STACK
		// equals >> COMPARE 2 VALUES AT STACK
		return true;
	}
	
	private static boolean isSymmetric(int n) {
		
		return n == reverse(n);
	}
	
	// 123(input) >> 321(result);
	private static int reverse(int input) {
		int result = 0;
		while(input != 0) {
			
			int div = input % 10;
			result = result * 10 + div;
			input /= 10;

		}
		
		return result;
	}
}
