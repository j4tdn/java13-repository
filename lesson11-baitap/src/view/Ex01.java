package view;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("Nhập n: ");
		Scanner ip = new Scanner(System.in);
		int n = ip.nextInt();
		print(n);
	}
	
	private static void print(int n) {
		int index = 2 * n - 1;
		int count = 0;
		for(int i = 1; i < index + 1; i++) {
			if (n < i) {
				count ++;
			}
			for(int j = 1; j < index + 1; j++) {
				if (i >= j && i <= n) {
					System.out.print(j + " ");
				}else if (j < index + 1 - i && i <= n) {
					System.out.print("  ");
				}else if(j <= n - count && i > n) {
					System.out.print(j + " ");
				}else if (i > n && j < n + count) {
					System.out.print("  ");
				}else {
					System.out.print(j + " ");
				}
				
					
			}
			
			System.out.println();
		}
	}
}
