package ex03;

/**
 * 15đ
 */
public class App {
	public static void main(String[] args) {
		int[] a = { 7, 173, 229 };
		System.out.println(getLeastCommonMultiple(a));
	}

	private static int getLeastCommonMultiple(int... a) {
		int lcm = lcm(a[0], a[1]);

		for (int i = 2; i < a.length; i++) {
			lcm = lcm(a[i], lcm);
		}

		return lcm;
	}

	// Mọi thứ đều tốt ngoại trừ cách tìm BCNN này chưa được tốt
	// VD a truyền vào 3 số 7 173 229 như trên
	// thì e phải while đến 277319 lần mới ra giá trị
	private static int lcm(int a, int b) {
		int lcm;
		lcm = (a > b) ? a : b;
		while (true) {
			if (lcm % a == 0 && lcm % b == 0) {
				break;
			}
			++lcm;
		}
		return lcm;
	}
}
