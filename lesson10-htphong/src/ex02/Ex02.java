package ex02;

import java.util.Arrays;

public class Ex02 {
	/**
	   Thực hiện bài toán chuyển đổi ma trận sau đây : Ma trận có duy nhất một
       phần tử có giá trị bằng 0. Chuyển tất cả các hàng và cột của nó về giá trị bằng 0
	 */
	public static void main(String[] args) {
		int[][] numbers = 
			{
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{1, 9, 0, 9},
				{2, 9, 6, 5},
				{1, 2, 4, 5}
			};
		int m = numbers[1].length;
		int n = numbers.length;
		int[][] result = revertArray(numbers);
		for(int i = 0; i < n; i++) {
			for(int j = 0; j<m;j++) {
				System.out.print(result[i][j]+"  ");
			}
			System.out.println();
		}
	}
	private static int[][] revertArray(int[][] numbers){
		int[][] a = numbers;
		int m = numbers[1].length;
		int n = numbers.length;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(a[i][j] == 0) {
					for(int k = 0; k < m; k++) {
						a[i][k] = 0;
					}
					for(int k = 0; k < n; k++) {
						a[k][j] = 0;
					}
					return a;
				}
			}
		}
		return a;
	}
}
