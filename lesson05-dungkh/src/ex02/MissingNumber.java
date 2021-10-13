package ex02;

/**
 * 13đ
 */
public class MissingNumber {
	public static void main(String[] args) {
		int[] array = new int[] { 3, 2, 1, 6, 5 };
		System.out.println("MissingNumber is: " + getMissingNumber(array));
	}
	private static int getMissingNumber(int[] array) {
		// good way
		// nhưng em phải duyệt từ 1 đến n 2 lần
		// trường hợp n lớn thì cách làm này chưa tốt
		// thử áp dụng công thức tìm missing number = n*(n+1)/sum(array of missing number)
		String str = "";
		for (int i : array) {
			str += i;
		}
		for (int i = 1; i <= array.length + 1; i++) {
			if (!str.contains("" + i)) {
				return i;
			}
		}
		return -1;
	}
}
