package hw;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("nhap so he thap phan: ");
		int dec = ip.nextInt();
		ex05(dec);
	}
	private static void ex05(int input) {
		int i = 1, sum = 0, d;
		do
		{
			d = input % 2;
			sum += i*d;
			input /= 2;
			i *= 10;
			
		} while(input > 0);
		System.out.println(sum);
	}
	

}
