package ex02;

public class MissingNumber {
	public static void main(String[] args) {
		int[] array = new int[] { 3, 2, 1, 6, 5 };
		int[] array1 = new int[] {3, 7, 9, 2, 1, 6, 5, 4, 10};
		System.out.println("MissingNumber is: " + getMissingNumber(array));
	}
	private static int getMissingNumber(int[] array) {
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
