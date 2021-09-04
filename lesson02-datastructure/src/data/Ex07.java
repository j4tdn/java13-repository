package data;

import java.util.Arrays;

public class Ex07 {

	public static void main(String[] args) {
		Integer a = new Integer(10);
		
		int sum = sumAll(10, 20);
		System.out.println("sum: " + sum);
	}
	
	
	public static int sumAll(int ... nbrs) {
		return Arrays.stream(nbrs).sum();
	}
}
