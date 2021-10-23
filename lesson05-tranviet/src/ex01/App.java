package ex01;

// 8đ
public class App {
	public static void main(String[] args) {
		int a = 64;
		int b = 4;
		// Em đọc đề bị thiếu
		// Cho 2 số a,b kiểm tra a có phải là lũy thừa của b không 
		// và ngược lại b có phải là lũy thừa của a ko
		
		// VD có thể sửa lại như sau
		System.out.println("isPower: " + (a > b ? isPowerOf(a, b) : isPowerOf(b, a)));
		
		if(isPowerOf(a, b)) {
			System.out.println(a + " là luỹ thừa của " + b);
		}
		else {
			System.out.println(a + " KHÔNG là luỹ thừa của " + b);
		}
	}
	
	public static boolean isPowerOf(int a, int b) {
		// Với Java convention
		// Em nên đặt theo camel case VD logInt hoặc logDouble
		// Còn sử dụng _ là SQL convention >> Ko sai nhưng tập cho quen
		double log_double = Math.log(a)/Math.log(b);
		int log_int = (int) Math.floor(log_double);
		// short version
		return log_int == log_double;
	}
}
