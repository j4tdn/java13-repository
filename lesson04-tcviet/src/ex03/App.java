/**
 * Viết chương trình in ra màn hình tam giác Pascal. 
 */
package ex03;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input n: ");

		int n = Integer.parseInt(sc.nextLine());
		int arr[][] = new int[n + 1][n + 2];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i + 1; j++) {
				if (j == 0 || j == i + 1) {
					arr[i][j] = 1;
					System.out.printf("%-5d", arr[i][j]);
				} else {
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
					System.out.printf("%-5d", arr[i][j]);
				}
			}
			System.out.println();
		}
		
//		/**
//		 * Quy luật: Phần tử thứ k trong hàng bằng phần tử thứ k-1 nhân (số hàng - số cột(k-1)) / (cột(k))
//		 */
//
//		for(int i =0;i<n;i++) {
//	        int number = 1;
//	        for(int j=0;j<=i;j++) {
//	             System.out.format("%4d",number);
//	             number = number * (i - j) / (j + 1);
//	        }
//	        System.out.println();
//	    }
		sc.close();
	}
}
