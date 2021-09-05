package data;

import java.util.Arrays;

public class Ex07 {

	public static void main(String[] args) {
		Integer a = new Integer(10);
		int sum = sumAll(10, 20, 30, 50);
		System.out.println("sum: " + sum);
	}
	@Deprecated(since = "9")
	public static int sum(int a, int b) {
		return a + b;	
	}

 	public static int sumAll(int ... nbrs) {
 		return Arrays.stream(nbrs).sum();
 	}
}