/*
 * Bài 2: Phần tử yên ngựa 
Cho bảng A kích thước MxN. Các phần tử của mảng là các số ngẫu nhiên [1-99]. Phần tử Aij được gọi là phần tử yên ngựa nếu nó là phần tử nhỏ nhất trong hàng của nó đồng thời là phần  tử lớn nhất trong cột của nó.  
47 47 [36] 
23 43 31 
46 7 29 
Theo ví dụ trong bảng số sau đây thì phần tử A02 chính là phần tử yên ngựa. Bạn hãy lập chương trình nhập từ bàn phím một bảng số kích thước MxN và kiểm tra xem nó có  phần tử yên ngựa hay không?

 */
package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập kích thước của Bảng A ");
		System.out.println("Số hàng: ");
		int m = ip.nextInt();
		System.out.println("Số cột: ");
		int n = ip.nextInt();
		int A[][] = new int[m][n]; 
		System.out.println("nhập giá trị");
		
		for (int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				A[i][j] = ip.nextInt();
			}
			System.out.println();
			
		}
		
		boolean check = true;
		int count = 0;
		
		for (int i = 0; i < m; i++) {
			int minRow = A[i][0];
			for(int j = 0; j < n; j++) {
				if (A[i][j] < minRow) {
					minRow = A[i][j]; 
					count = j;
				}	
			}
			
			for(int j = 0; j < n; j++) {
				if (A[j][count] > minRow) {
					check = false;
					break;
				}
			}
			if (check) {
				System.out.println("YES!");
				break;
			}
		}
		
		if (!check) {
			System.out.println("NO!");
		}
	}
}
