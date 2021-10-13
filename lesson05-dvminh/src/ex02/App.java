package ex02;

/**
 * 12đ
 */
public class App {
	public static void main(String[] args) {
		int[] a = { 3, 2, 1, 6, 5 };
		System.out.println(getMissingNumber(a));
	}

	private static boolean isCheck(int[] a, int i) {
		for (int j = 0; j < a.length; j++) {
			if (i == a[j])
				return true;
		}
		return false;
	}

	// A hiểu cách làmNhưng e có thể thinking cách này nhanh hơn. Với n = 6
	// Em có thể lấy n*(n+1)/2 - sum(a[...])
	// result = 6*7/2 - (1+5+6+2+4) = 3
	private static int getMissingNumber(int[] b) {
		// 1-6
		for (int i = 1; i < b.length + 1; i++) {
			// Vòng lặp này bị thừa ?
			if (!isCheck(b, i))
				return i;
		}
		return 0;
	}

}
