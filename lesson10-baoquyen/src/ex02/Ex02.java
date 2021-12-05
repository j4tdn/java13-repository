package ex02;

import java.util.Scanner;

/**
 * 
 * Thực hiện bài toán chuyển đổi ma trận sau đây : Ma trận có duy nhất một phần tử có giá trị bằng 0.
 * Chuyển tất cả các hàng và cột của nó về giá trị bằng 0
 *
 */
public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] arr;
		int m, n;
		System.out.print("Nhập số hàng: ");
		m = input.nextInt();
		System.out.print("Nhập số cột: ");
		n = input.nextInt();
		arr = setArray(m, n);
		getArray(arr, m, n);
		System.out.println("----------------------\n");
		change(arr, m, n);
		getArray(arr, m, n);
		
		
	}
	
	public static int[][] setArray(int m, int n){
		Scanner kb = new Scanner(System.in);
		int[][] arr = new int[m][n];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("arr[" + i + "][" + j + "] = ");
				arr[i][j] = kb.nextInt();
			}
		}
		return arr;
	}
	
	public static void getArray(int[][] arr, int m, int n) {
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	public static void change(int[][] arr, int m, int n) {
//		boolean[][] flag = new boolean[m][n];
		int[][] flag = new int[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(arr[i][j] == 0 && flag[i][j] == 0) {
					for(int k = 0; k < n; k++) {
						if(arr[i][k] != 0 && flag[i][k] == 0) {
							flag[i][k] = 1;
							arr[i][k] = 0;
						}
					}
					for(int k = 0; k < m; k++) {
						if(arr[k][j] != 0 && flag[k][j] == 0) {
							flag[k][j] = 1;
							arr[k][j] = 0;
						}
					}
				}
			}
		}
	}
}

