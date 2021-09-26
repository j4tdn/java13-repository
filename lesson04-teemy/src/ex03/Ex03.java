package ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n");
		int n=sc.nextInt();
		int[][] a = new int[n+1][n+3];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i+2;j++ ) {
				a[i][j]=1;
			}
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++ ) {
				a[i][j]=a[i-1][j]+a[i-1][j-1];
			}
		}
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i+1;j++ ) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
