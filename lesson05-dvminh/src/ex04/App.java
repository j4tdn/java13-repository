package ex04;

/**
 * Có idea 5đ
 */
public class App {
	public static void main(String[] args) {
		int[] a = { 3, 15, 21, 0, 15, 17, 21 };
		// b null
		int[] b = null;

		getUniqueNumbers(a, b);
	}

	private static void getUniqueNumbers(int[] a, int[] b) {
		// int[] b = null;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (!isCheck(a, a[i])) {
					// may code ko nhảy vào đây
					// nếu có nhảy vào đây em cũng sẽ bị null pointer exception
					// mảng b null thì làm sao em set b[i] được
					// ít nhất cũng phải khai báo int[] b = new int[...];
					// Là nó sẽ khởi tạo ô nhớ trên heap cho đối tượng mảng b
					// sau đó em mới b[i] = ... để gán giá trị được
					b[count] = a[i];
					count++;
				}
			}
		}
		// b still null
		sort(b);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] + " ");
		}
	}

	// khi method name có 1 word >> viết thường chữ đầu >> sort
	private static int[] sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length + 1; j++) {
				if (a[i] < a[j]) {
					int b = a[i];
					a[i] = a[j];
					a[j] = b;
				}
			}
		}
		return a;
	}

	private static boolean isCheck(int[] a, int b) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] == b)
					return true;
			}
		}
		return false;
	}

}
