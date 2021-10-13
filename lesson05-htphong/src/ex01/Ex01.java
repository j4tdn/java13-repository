package ex01;

/**
 * Nhớ format code
 * 8đ
 */
public class Ex01 {
	public static void main(String[] args) {
		// A check 2, 8 đang false
		// Nên a sửa code lại như bên dưới nhé
		// Thêm check đoạn a > b hoặc ngược lại là oke
		// Đúng 50%
		int a = 2;
		int b = 8;
		System.out.println(a > b ? isPowerOf(a, b) : isPowerOf(b, a));
	}

	public static boolean isPowerOf(double a, int b) {
		boolean check = false;
		if (a < 1) {
			int i = -1;
			double p = Math.pow(b, i);
			while (p >= a) {
				if (p == a) {
					check = true;
					break;
				} else {
					i--;
					p = Math.pow(b, i);
				}
			}
		} else {
			int i = 0;
			double p = Math.pow(b, i);
			while (a >= p) {
				if (p == a) {
					check = true;
					break;
				} else {
					i++;
					p = Math.pow(b, i);
				}
			}
		}
		return check;
	}
}
