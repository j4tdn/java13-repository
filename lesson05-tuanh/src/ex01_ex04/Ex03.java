package ex01_ex04;
/*
 * Bài 3: Tìm bội chung nhỏ nhất của các phần tử trong mảng.
 */
public class Ex03 {
	public static void main(String[] args) {

		int[] arr1 = {2,3};
		int[] arr2 = {2,3,4};
		System.out.println("BCNN : " + getLeastCommonMultiple(arr1));
		System.out.println("BCNN : " + getLeastCommonMultiple(arr2));
	}

	public static int UCLN(int a, int b) {
		if (b == 0)
			return a;
		return UCLN(b, a % b);
	}

	public static int BCNN(int a, int b) {
		return (a * b / UCLN(a, b));

	}

	public static int getLeastCommonMultiple(int a[]) {
		int temp = BCNN(a[0], a[1]);
		for (int i = 2; i < a.length; i++) {
			temp = BCNN(temp, a[i]);
		}
		return temp;
	}


}
