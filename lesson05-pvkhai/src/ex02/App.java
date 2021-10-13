package ex02;

/**
 * 11đ
 */
public class App {
	public static void main(String[] args) {
		int[] arr1 = { 3, 2, 1, 6, 5 };
		int[] arr2 = { 1, 2, 3, 4, 5, 6 };
		System.out.println(getMissingNumber(arr1, arr2));
	}

	public static int getMissingNumber(int[] arr1, int[] arr2) {
		int b = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				// nhớ thêm block code {} vào em nhé
				if (arr1[i] == arr2[j])
					break;
				else
					// A hiểu idea nhưng cách làm chưa tốt lắm
					// VD: n = 50 là mảng arr2 e phải tự khai báo 1,2,3...,50 >> dài
					// n = 50 thì e phải duyệt 50 * 50 >> complexity O(n2) >> chưa tốt
					// E có thể thinking cách này nhanh hơn. Với n = 6
					// Em có thể lấy n*(n+1)/2 - sum(a[...])
					// result = 6*7/2 - (1+5+6+2+4) = 3
					b = arr2[j];
			}
		}
		return b;

	}

}
