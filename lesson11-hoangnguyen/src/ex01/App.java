package ex01;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input n: " );
		int n = Integer.parseInt(sc.nextLine());
		printTriangle(n - 2);
	}

	private static void printTriangle(int n) {
		int m = 2 * n - 1;
		for (int i = 1; i <= n - 1; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			int check = 2 * (n - i) - 1;

			for (int k = 1; k <= check; k++) {
				System.out.print("  ");
			}
			
			for (int t = m - i + 1; t <= m; t++) {
				System.out.print(t + " ");
			}
			
			System.out.println("\n");
		}

		for (int i = 1; i <= m; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n");
		
		for (int i = n - 1; i >= 1; i--) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			
			int check = 2 * (n - i) - 1;
			
			for(int k = 1; k <= check; k++) {
				System.out.print("  ");
			}
			
			for(int t = m - i + 1; t <= m; t++) {
				System.out.print(t + " ");
			}
			
			System.out.println("\n");
		}
	}
}
