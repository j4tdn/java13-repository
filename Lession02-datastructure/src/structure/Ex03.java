package structure;

public class Ex03 {
	public static void main(String[] args) {
		int a = 10;
		int b = 6;
		int c = 8;
		
		System.out.println("max: " + max(a, b, c));
		System.out.println("max: " + max(a, b));
	}
		private static int max (int a, int b) {
			int max = a > b ? a : b;
					return max;
		}
		private static int max(int a, int b ,int c) {
			if(a > b && a > c) {
				return a;
			}
			if (b > a && b > c) {
				return b;
			}	
			return c;
		}
}
