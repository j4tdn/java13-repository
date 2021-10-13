package ex01;

/**
 * 13đ
 */
public class Ex01 {
	public static void main(String[] args) {
		if (isPowerOf(4, 3)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	// A sửa lại code em 1 xíu như này có vẻ gọn hơn nha
	private static boolean isPowerOf(int a, int b) {
		return a > b ? isPower(a, b) : isPower(b, a);
	}
	
	private static boolean isPower(int a, int b) {
		// Nên đặt tên biết có ý nghĩa hơn
		double log = Math.log(a) / Math.log(b);
		int logi = (int) (Math.floor(log));
		
		// short version
		return log - logi == 0;
	}

}