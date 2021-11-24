package array;

import java.util.Scanner;

/*
 * Pascal
 */
public class ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số lượng mảng: ");
		int n = Integer.parseInt(ip.nextLine());
		int [][] arr = new int[n][n];
		Pascal(arr);
	}
	private static void Pascal(int [][] arr) {
		for (int i = 0;i < arr.length;i++) {
			for(int j = 0; j <= i ; j++) {
				if(i == j || j == 0) {
					arr[i][j] = 1;
					System.out.print(arr[i][j] + "\t");
				}else {
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
					System.out.print(arr[i][j] + "\t");
				}
				
			}System.out.println("\n");
		}
	}
}
