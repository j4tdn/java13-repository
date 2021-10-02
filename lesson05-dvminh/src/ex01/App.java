package ex01;

public class App {
	public static void main(String[] args) {
		int a = 20;
		int b = 4;
		System.out.println(isCheck(a, b));
		
	}
	
	private static boolean isCheck(int a, int b) {
		if( a * b == 0 || a * b == 1 ) return true;
		if (a > b) {
			int x = a / b;
			int y = a % b;	
			if (y != 0) return false;
			return isCheck(x, b);
		}
		
		if (a < b) {
			int x = b / a;
			int y = b % a;	
			if (y != 0) return false;
			return isCheck(x, a);
		}
		return true;
		
		
		
	}	
}
