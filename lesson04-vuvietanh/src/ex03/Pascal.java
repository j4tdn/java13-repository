package ex03;

import java.util.Scanner;

public class Pascal {
/*
 * Tam giác Pascal
 */
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số dòng: ");
		int n = Integer.parseInt(ip.nextLine());
		int[][] digits = new int[n][n];
		
		Pascal(digits);
		
		
	}
	private static void Pascal(int [][]digits ) {
		for(int i = 0; i <= digits.length; i++) {
			for (int j = 0; j <= i; j++) {
				if(i == j || j == 0) {
					digits[i][j] = 1;
					System.out.print(digits[i][j] + "\t");
				}
				else {
					digits[i][j]= digits[i-1][j-1] + digits[i-1][j];
					System.out.print(digits[i][j] +"\t");
				}
			}System.out.println();
		}
	}
}
