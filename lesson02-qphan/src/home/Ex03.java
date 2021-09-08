package home;

/**
 * Bài 3: Nhập vào một số bất kỳ. 
 * Kiểm tra số đó có phải là số đối xứng hay không
 * VD: 121 13331 123321 là số đối xứng.
 * VD: 123 234 không phải là số đối xứng
 * 
 * Chuỗi: "123321", "abcbca"
 */
public class Ex03 {
	public static void main(String[] args) {
		int number = 121;
		System.out.println(isSymmetric(number));
		System.out.println(isSymmetric("" + number));
		System.out.println(isSymmetric("1232221"));
	}
	
	// abcde
	private static boolean isSymmetric(String s) {
		// length = 7
		// i=0 cp i=6 >>  7(length) - i - 1
		// i=1 cp i=5 >>  7(length) - i - 1
		// i=2 cp i=4 >>  7(length) - i - 1
		int length = s.length();
		for (int i = 0; i < length/2; i++) {
			// i = 0
			char left  = s.charAt(i);
			char right = s.charAt(length - i - 1);
			if (left != right) {
				return false;
			}
		}
		
		return true;
		// ==     >> compare 2 values at stack
		// equals >> compare 2 values at stack (required String type)
	}
	
	private static boolean isSymmetric(int n) {
		return n == reverse(n);
	}
	
	// 123(input) >> 321(result)
	private static int reverse(int input) {
		int result = 0;
		while(input != 0) {
			int div = input % 10;       // 3   2   1
			result = result*10 + div;   // 3   32  321
			input /= 10;                // 12  1   0
		}
		return result;
	}
}
