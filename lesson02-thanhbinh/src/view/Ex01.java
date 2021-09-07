package view;

import java.util.Iterator;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Ex01 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		double a = sc.nextInt();
		pow(a);
	}
	// check exponential
	private static void pow(double input) {
		double log = Math.log(input);
		double log2 = Math.log(2);
		if (log/log2 %1==0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}

}
