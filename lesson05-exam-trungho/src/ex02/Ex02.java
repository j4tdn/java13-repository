package ex02;

/**
 * 13đ
 *
 */
public class Ex02 {
	public static void main(String[] args) {
		int[] arrayA = {3, 2, 1, 6, 5};
		getMissingNumber(arrayA);
	}
	
	public static int getMissingNumber(int[] arrayA) {
		int maxNumber = arrayA.length + 1;
		
		// Create the array with full value
		int[] arrayFull = new int[maxNumber];
		for(int i = 0; i < maxNumber; i++) {
			arrayFull[i] = i+1;
		}
		
		// Get the number that in arrayFull but not in arrayA
		// Accepted - nhưng duyệt đến 2 vòng for ko cần thiết
		// A có thể áp dụng công thứ tìm missing number bằng cách sau (VD n = 6)
		// lấy n*(n+1)/2 - sum(a[...])
		// result = 6*7/2 - (1+5+6+2+4) = 3
		for (int j = 0; j < maxNumber; j++) {
			int count = 0;
			for (int k = 0; k < maxNumber - 1; k++) {
				if(arrayFull[j] == arrayA[k]) {
					count = count + 1;
				}
			}
			if(count == 0) {
				System.out.println(arrayFull[j]);
				return arrayFull[j];
			}
		}
		return -1;
	}
}
