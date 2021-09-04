package data;

import bean.Digit;

public class Ex11 {
	public static void main(String[] args) {
		Integer a = 10; // H1
		Integer b = 20; // H2
		
		swap(a, b);
		
		System.out.println("a: " + a); //
		System.out.println("b: " + b); //
		
		Digit d1 = new Digit(15);
		Digit d2 = new Digit(25);
		
		swap(d1, d2);
		
		System.out.println();
	}
	
	// no swap with primitive 
	
	// no swap with object Integer
	
	private static void swap(Integer first, Integer second) {
		Integer tmp = first;
		first = second;
		second = tmp;
		
	}
	
	// swapped
	private static void swap(Digit df, Digit ds) {
		int tmpV = df.value;
		df.value = ds.value;
		ds.value = tmpV;
	}
	
	
}
