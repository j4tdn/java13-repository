package hw;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = ip.nextInt();
		ex03(n);
	}
	private static void ex03(int input) {
		int tmp, sum = 0, d;
		
		for (tmp = input; input !=0; input /= 10) {
			d = input % 10;
			sum = sum * 10 + d;
		}
		if (tmp == sum) {
			System.out.println(tmp + " true");
		} else {
			System.out.println(tmp + " false");
		}
	}

}
