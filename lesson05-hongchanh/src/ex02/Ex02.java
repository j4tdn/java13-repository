package ex02;

/**
 * 12đ
 */
public class Ex02 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 6 };
		int[] b = { 3, 1, 2, 4, 7, 5, 8 };

		check(a);
		check(b);
	}

	// same bài 1
	private static void check(int[] a) {
		int b = a.length;

		int[] c = new int[b + 1];

		// Mấy đoạn in này em nên viết 1 hàm để nhìn code đỡ nhớp
		// Trong 1 hàm check mà có đến vòng for
		for (int i = 0; i < b + 1; i++) {
			c[i] = i + 1;
			System.out.print(c[i] + " ");
			if (i == b) {
				System.out.println();
			}
		}

		for (int i = 0; i < b; i++) {
			System.out.print(a[i] + " ");
			if (i == b - 1) {
				System.out.println();
			}
		}

		System.out.println("===================");

		// good way
		// nhưng em phải duyệt từ 1 đến n 2 lần
		// trường hợp n lớn thì cách làm này chưa tốt
		// thử áp dụng công thức tìm missing number = n*(n+1)/sum(array of missing
		// number)
		for (int i = 0; i < b + 1; i++) {
			boolean k = false;
			for (int j = 0; j < b; j++) {
				if (c[i] == a[j]) {
					k = true;
				}
			}
			if (k == false) {
				System.out.println(c[i] + " la phan tu can tim");
				break;
			}
		}
	}

}
