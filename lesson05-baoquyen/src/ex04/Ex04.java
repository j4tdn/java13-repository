package ex04;

/**
 * 17
 */
public class Ex04 {
	public static void main(String[] args) {
		int[] a = { 3, 15, 21, 0, 15, 17, 21 };
		int[] result;

		result = getUniqueNumbers(a);
		show(result);
	}

	private static int[] getUniqueNumbers(int[] a) {
		// Đặt tên biến có nghĩa hơn
		// Để khi a đọc hoặc sau có người code review sẽ hiểu cách làm của em
		int resultIndex = 0;
		int[] result = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			// Cách này cũng được nhưng chưa phải là cách hay
			// Ví dụ mảng có 10 phần tử. Thì e cứ được n*n lần duyệt
			// Complexity O(n2). Bài này có thể tìm cách giảm số vòng lặp được
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count == 1) {
				result[resultIndex] = a[i];
				resultIndex++;
			}
		}
		int[] finalResult = new int[resultIndex];
		for (int i = 0; i < finalResult.length; i++) {
			finalResult[i] = result[i];
		}
		return finalResult;
	}

	private static void show(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}
}
