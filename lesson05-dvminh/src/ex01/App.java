package ex01;

/**
 * 13đ
 */
public class App {
	public static void main(String[] args) {
		System.out.println(isPowerOf(8, 2));
		System.out.println(isPowerOf(2, 8));
		System.out.println(isPowerOf(20, 5));
		System.out.println(isPowerOf(5, 25));
		System.out.println(isPowerOf(25, 5));
		
	}
	
	// good way
	// >> nên đặt tên hàm có ý nghĩa
	// >> code hơi bị duplicate khi 2 đoạn if else e chỉ swap lại 2 vị trí a,b
	// >>> trước khi gọi hàm này e có thể check a ? b isPowerOf(a, b) : isPowerOf(b,a)
	// Rồi chỉnh code trong hàm lại 1 xíu
	private static boolean isPowerOf(int a, int b) {
		if( a * b == 0 || a * b == 1 ) return true;
		if (a > b) {
			int x = a / b;
			int y = a % b;	
			if (y != 0) return false;
			return isPowerOf(x, b);
		}
		
		if (a < b) {
			int x = b / a;
			int y = b % a;	
			if (y != 0) return false;
			return isPowerOf(x, a);
		}
		return true;
		
		
		
	}	
}
