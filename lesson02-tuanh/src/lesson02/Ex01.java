package lesson02;

public class Ex01 {
	public static void main(String[] args) {
		int n = 8;
		exp(n);
	}
	private static void exp(int n) {
		double log = Math.log(n)/Math.log(2);
		if((n != 0) && (n == Math.pow(2,log))) {
			System.out.println( n + " is an exponential of 2");
		}else
		System.out.println(n + " isn't an exponential of 2");
	}

}
