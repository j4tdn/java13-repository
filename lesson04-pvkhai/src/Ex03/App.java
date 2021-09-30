package Ex03;

import java.util.Scanner;


public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n: ");
		int n = Integer.parseInt(sc.nextLine());

		int[][] a = new int[100][100];

		for(int i=0 ; i<=n ; i++) {
			for(int j=0 ; j<=i+1 ; j++) {
				if(j==0 || j==i+1) {
					a[i][j] = 1;
				}
				else {
					a[i][j] = a[i-1][j] + a[i-1][j-1];
				}
				System.out.printf(a[i][j] + " ");
			}
			System.out.println();	
		}
	}
}
