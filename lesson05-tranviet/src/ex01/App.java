package ex01;

public class App {
	public static void main(String[] args) {
		int a = 64;
		int b = 4;
		if(isPowerOf(a, b)) {
			System.out.println(a + " là luỹ thừa của " + b);
		}
		else {
			System.out.println(a + " KHÔNG là luỹ thừa của " + b);
		}
	}
	
	public static boolean isPowerOf(int a, int b) {
		double log_double = Math.log(a)/Math.log(b);
		int log_int = (int) Math.floor(log_double);
		if(log_int == log_double) { 
			return true;
		}
		else return false;
	}
}
