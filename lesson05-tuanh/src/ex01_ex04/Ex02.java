package ex01_ex04;
/**
 * Bài 2: Tìm số nguyên còn lai trong khoảng [1,n] không tồn tại trong mảng A.
 */
public class Ex02 {
	public static void main(String[] args) {
		int array1[] = {3,2,1,6,5};
		int array2[] = {3,7,9,2,1,6,5,4,10};
		System.out.println(getMissingNumber(array1));
		System.out.println(getMissingNumber(array2));
	}
	
	private static int getMissingNumber(int array[]) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		int number = 1;
		for (int i = 0; i < array.length; i++) {
			if (number != array[i]) {
				return number;
			}
			number++;
		}

		return number;

	}
}
