package ex01;

/**
 * 11đ
 */
public class Ex01 {
	public static void main(String[] args) {
		System.out.println(isPowerOf(8, 2));
		System.out.println(isPowerOf(2, 8));
		System.out.println(isPowerOf(14, 3));
	}

	// đúng ra return boolean, nhưng a để void dùng vs method của em
	private static String isPowerOf(int a, int b) {
		return a > b ? check(a, b) : check(b, a);
	}

	// đặt tên hàm có ý nghĩa, có return type để reuse
	// check ???
	// chỉ dùng để lưu trữ value, k cần null value >> int thay vì Integer
	// thiếu check corner case như a b = 0, 1 và nên check luôn case a = b
	private static String check(int a, int b) {
		// good
		// nhưng a sẽ thay thế bằng 1 method mới đỡ gán lại
		int k = a;
		while (a >= b) {
			if (a % b == 0) {
				a = a / b;
			} else {
				return k + " khong phai la luy thua cua " + b + " !";
			}
		}
		if (a == 1) {
			return k + " la luy thua cua " + b + " !";
		}

		return "invalid";
	}
}
