package lesson02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		int input = sc.nextInt();
		if( isCheck(input) ) System.out.println(input + " la so doi xung");
		else System.out.println(input + " khong phai la so doi xung");
	}
	private static boolean isCheck(int input) {
		int tmp = input;
		int m = 0;
		while(tmp != 0) {
			m = m*10 + tmp % 10;
			tmp/=10;
		}
		if( m == input ) return true; 
		else return false;
	}
}
