package ex02;
/*
 * Bài 2: Thực hiện bài toán chuyển đổi ma trận sau đây : Ma trận có duy nhất một
phần tử có giá trị bằng 0. Chuyển tất cả các hàng và cột của nó về giá trị bằng 0
 */
import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		// int[][] numbers= {{1,2,3,4},{5,6,8,7},{1,9,0,9},{2,9,6,5},{1,2,4,5}};
		int[][] numbers = { { 1, 2, 3, 4 }, { 5, 0, 8, 7 }, { 1, 9, 0, 9 }, { 2, 0, 6, 5 }, { 1, 2, 4, 5 } };

		int[][] rs = convert(numbers);
		for (int i = 0; i < rs.length; i++) {
			for (int j = 0; j < rs[1].length; j++) {
				System.out.print(rs[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static int[][] convert(int[][] numbers) {
		int[] m = new int[numbers.length * numbers[1].length];
		int[] n = new int[numbers.length * numbers[1].length];
		int len = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[1].length; j++) {
				if (numbers[i][j] == 0) {
					m[len] = i;
					n[len] = j;
					len++;
				}
			}
		}
		for (int i = 0; i < len; i++) {
			numbers = work(numbers, m[i], n[i]);
		}
		return numbers;
	}

	private static int[][] work(int[][] numbers, int m, int n) {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i][n] = 0;
		}
		for (int i = 0; i < numbers[1].length; i++) {
			numbers[m][i] = 0;
		}
		return numbers;
	}

}
