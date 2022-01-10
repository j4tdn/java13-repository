package ex01;

/**
 * Bài 1: Với n nhập từ bàn phím. Viết chương trình in ra 2 tam giác đối đỉnh bằng số tăng theo cột từ
	1 đến 2n-1.
	VD: Với n = 5. Hai tam giác sẽ đối đỉnh qua giá trị 3
 */

public class App {
	public static void main(String[] args) {
		int n = 7;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j > i && (j + i) < n - 1 || j < i && (j + i) > n - 1) {
					System.out.print("  ");
				} else {
					System.out.print((j + 1) + " ");
				}
			}
			System.out.println();
		}
	}
}
/*
 	a[0][0]	a[0][1]	a[0][2]	a[0][3]	a[0][4]
	a[1][0]	a[1][1]	a[1][2]	a[1][3]	a[1][4]
	a[2][0]	a[2][1]	a[2][2]	a[2][3]	a[2][4]
	a[3][0]	a[3][1]	a[3][2]	a[3][3]	a[3][4]
	a[4][0]	a[4][1]	a[4][2]	a[4][3]	a[4][4]

*/