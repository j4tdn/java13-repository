package ex02;

import java.sql.SQLOutput;

/*
 *Bài 2(30đ): Cho n xâu chuỗi, mỗi chuỗi bao gồm các ký tự la tinh thường và chữ số. Đoạn các
ký tự số liên tục tạo thành một số nguyên. Ở mỗi xâu chuỗi trích ra các số nguyên và tìm số lớn
nhất, sắp xếp các số lớn nhất nhận được từ các xâu đã cho và in ra theo thứ tự không giảm, mỗi số
được đưa ra dưới dạng không có các số 0 không có nghĩa (024)
Nếu chuỗi rỗng hoặc chuỗi chỉ chứa các ký tự latinh thì số lớn nhất của chuỗi đó là 0
Ví dụ: với n = 1 : xâu 01a2b3456cde478 : Kết quả: 3456
với n = 2 : xâu aa6b546c6e22h, aa6b326c6e22h: Kết quả: 326, 546
Method signature: getLargestNumbers(String ...ss) >> String[]
 */
public class Ex02 {
	public static void main(String[] args) {
		int n = 2;

		String[] text = { "aa6b546c6e22h", "aa6b326c6e22h" };
		String[] results = getLargestNumbers(text, n);
		for (int i = 0; i < n; i++) {
			System.out.print(results[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			sort(results[i]);
		}

	}

	private static void sort(String str) {
		int count = str.length();
		char[] st = new char[count];
		for (int i = 0; i < count; i++) {
			st[i] = str.charAt(i);
		}
		for (int i = 0; i < count - 1; i++) {
			for (int j = i + 1; j < count; j++) {
				if (st[i] > st[j]) {
					char temp = st[i];
					st[i] = st[j];
					st[j] = temp;
				}
			}
		}
		if (st[0] == 0) {
			System.out.println("có so 0 đúng đầu");
			return;
		}
		for (int i = 0; i < count; i++) {
			System.out.print(st[i]);
		}
		System.out.print(" ");
	}

	private static String[] getLargestNumbers(String[] text, int n) {
		String[] rs = { "", "" };
		for (int i = 0; i < n; i++) {
			String[] texts = text[i].split("[a-z]+");
			String max = texts[0];

			for (String element : texts) {
				if (element.length() > max.length()) {
					max = element;

				} else if (element.length() > max.length() && (element.compareTo(max) == 1)) {
					max = element;
				}
				rs[i] = max;
			}
		}
		return rs;
	}
}
