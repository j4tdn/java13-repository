package ex06;

import java.util.Scanner;

/**
 *Bài 6: Cho dãy các số tự nhiên được viết ra thành một dãy vô hạn trên đường thẳng:
1234567891011121314 ........ (1). Hỏi số ở vị trí thứ 100 trong dãy trên là số nào ?
Bạn hãy làm bài này theo hai cách: Cách 1 dùng suy luận logic trong vòng 30s rồi nhớ
kết quả trong đầu và cách 2 viết chương trình để tính toán và so sánh hai kết quả với
nhau.
 */
public class Ex06 {
	public static void main(String[] args) {
		String num = "123133476476519785748548654857409189384975846575055847";
		int k = 0;
		char[] c = num.toCharArray();

		Scanner sc = new Scanner(System.in);

		System.out.println("Input K: ");
		k = sc.nextInt();

		System.out.println("result: " + c[k-1]);
	}
}
