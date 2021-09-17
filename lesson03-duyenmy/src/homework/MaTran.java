package homework;

import java.util.Random;
import java.util.Scanner;

public class MaTran {
	
	//Hàm tìm phần tử nhỏ nhất trong hàng
	static int minM(int[][] a, int m, int n) {
		int min = a[m][0];
		for (int i = 1; i < n; i++) {
			if(a[m][i] < min) {
				min = a[m][i];
			}
		}
		
		return min;
	}
	
	//Hàm tìm phần tử lớn nhất trong cột
	static int maxN(int[][] a, int m, int n) {
		int max = a[0][n];
		for(int i = 1; i < m; i++) {
			if(a[i][n] > max) {
				max = a[i][n];
			}
		}
		
		return max;
}
	public static void main(String[] args) {
		int m,n;
		int A[][];
		Scanner sc = new Scanner(System.in);
		//Nhập kích thước của ma trận M x N
		System.out.print("Nhập số hàng ");
		m = sc.nextInt();
		System.out.print("Nhập số cột ");
		n = sc.nextInt();
		 A = new int[m][n];
		 System.out.println("===================================================================");
		 
		 //Nhập các phần tử của ma trận
		 System.out.print("Nhập các phần tử của ma trận \n");
		 for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					System.out.print("A["+i+"]["+j+"]=");
					A[i][j]=sc.nextInt();
				}
			}
		 System.out.println("===================================================================");
		 //Xuất ma trận
		 for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					System.out.print(A[i][j] + "\t");
				}
				System.out.println("\n");
			}
		 System.out.println("===================================================================");
		 //Kiểm tra phần tử yên ngựa trong ma trận
		 int dem = 0;
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					if(minM(A, i, n) == maxN(A, m, j)) {
						System.out.println("A[" + i + "][" + j + "] = " + A[i][j]
											+ "\nChính là một phần tử yên ngựa!");
						dem++;
					}
				}
			}
			
			if(dem == 0) {
				System.out.println("Ma trận này không có phần tử yên ngựa nào cả!!!");
			}
		}
	}

