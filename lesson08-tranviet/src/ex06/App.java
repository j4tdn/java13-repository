/**
 * Bài 6: Cho dãy các số tự nhiên được viết ra thành một dãy vô hạn trên đường thẳng:
	1234567891011121314 ........ (1). Hỏi số ở vị trí thứ 100 trong dãy trên là số nào ?
	Bạn hãy làm bài này theo hai cách: Cách 1 dùng suy luận logic trong vòng 30s rồi nhớ
	kết quả trong đầu và cách 2 viết chương trình để tính toán và so sánh hai kết quả với
	nhau.
	Tổng quát bài toán trên: Chương trình yêu cầu nhập số K từ bàn phím và in ra trên màn
	hình kết quả là số nằm ở vị trì thứ K trong dãy (1) trên. Yêu cầu chương trình chạy càng
	nhanh càng tốt
 */
package ex06;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input K: ");
		int K = sc.nextInt();
		System.out.println("Số nằm ở vị trí thứ " + K + " trong dãy (1) trên là: " + findNumberAtIndexK(K));
		sc.close();
	}

	private static int findNumberAtIndexK(int k) {
		if (k <= 10) {
			return Integer.parseInt(String.valueOf(stringFrom1to10().charAt(k)));
		} else if (10 <= k && k < 100) {
			return Integer.parseInt(String.valueOf(stringFrom1to100().charAt(k)));
		} else if (k >= 100) {
			return Integer.parseInt(String.valueOf(stringFrom1to1000().charAt(k)));
		}
		return 0;
	}

	private static String stringFrom1to10() {
		String s = "";
		for (int i = 1; i <= 10; i++) {
			s += i;
		}
		return s;
	}

	private static String stringFrom1to100() {
		String s = stringFrom1to10();
		for (int i = 11; i <= 100; i++) {
			s += i;
		}
		return s;
	}

	private static String stringFrom1to1000() {
		String s = stringFrom1to100();
		for (int i = 101; i <= 1000; i++) {
			s += i;
		}
		return s;
	}
}
