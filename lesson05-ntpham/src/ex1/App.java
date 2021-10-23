package ex1;

// Bài làm tốt nhưng a vẫn để 50% điểm vì chưa đúng đề
// 9đ
public class App {
	public static void main(String[] args) {
		System.out.println(isPowerOf(8,2));
		System.out.println(isPowerOf(6,2));
		System.out.println(isPowerOf(20,4));
		System.out.println(isPowerOf(64,4));
		
		// Chắc em đang đọc thiếu đề
		// Yêu cầu kiểm tra 2 số a,b có phải là lũy thừa của nhau ko
		// a lũy thừa của b hoặc b lũy thừa của a đều return true
		System.out.println(isPowerOf(2,8));
	}
	
	public static boolean isPowerOf(int a, int b) {
		if (a == 1) return true;
		if (a % b != 0) return false;
		return isPowerOf(a/b, b);
	}
}

