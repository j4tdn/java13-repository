package ex01_ex04;
/**
 * Bài 2: Tìm số nguyên còn lai trong khoảng [1,n] không tồn tại trong mảng A.
 * 13đ
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
			// good - A hiểu cách làm
			// E cho sort trước xong rồi xử lý
			// Nhưng cách này phải xử lý đến 3 vòng for
			// E thử áp dụng công thức để tìm missing number từ 1 đến n sẽ tốt hơn như sau
			// Với giá trị từ 1 đến n
			// missing number = n * (n + 1) - sum(array with missing number)
			// VD: n = 5, array = {1,2,4,5}
			// missing = 5 * 6 / 2 - (1 + 2 + 4 + 5) = 3
			if (number++ != array[i]) {
				return number;
			}
		}

		return number;

	}
}
