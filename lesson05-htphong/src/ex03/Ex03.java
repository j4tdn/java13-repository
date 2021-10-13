package ex03;

/**
 * 14đ
 */
public class Ex03 {
	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 6, 8, 10 };
		System.out.println("BCNN: " + getLeastCommonMultiple(a));
	}

	public static int getLeastCommonMultiple(int a[]) {
		int max = 1;

		// Có idea nhưng a nghĩ e có thể tìm cách tốt hơn
		// VD a truyền vào 3 số 7 173 229
		// thì e phải while đến 277319 lần mới ra giá trị
		for (int i = 0; i < a.length; i++) {
			max *= a[i];
		}
		for (int i = 1; i < max; i++) {
			boolean check = false;
			for (int j = 0; j < a.length; j++) {
				// convention >> nhớ thêm {}
				if (i % a[j] == 0)
					check = true;
				else {
					check = false;
					break;

				}
			}
			if (check == true) {
				return i;
			}
		}
		return max;
	}
}
