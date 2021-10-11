package ex01;

/**
 * Hôm sau nhớ format code -1
 * 12đ
 */
public class Ex01 {
	public static void main(String[] args) {
		System.out.println(isPowerOf(9, 3));
	}

	public static boolean check(int a, int b) {
		double logAB = Math.log(a) / Math.log(b);
		int logABi = (int) (Math.floor(logAB));
		// Thay thế bằng version ngắn hơn -1
		return logAB - logABi == 0;
	}

	public static boolean isPowerOf(int a, int b) {
		// Tương tự -1
		// Như này thì e có thể gọi hàm check 2 lần
		// Idea: Chỗ hàm check e có thể kiểm tra
		// Nếu a > b thì log = log(a) / log(b)
		// Ngược lại thì log = log(b) / log(a)
		// Nhớ check corner case là mũ 0
		return check(a, b) || check(b, a);
	}

}
