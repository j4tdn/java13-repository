package polymorphsim.method;

public class MathUtils {
	public MathUtils() {
			}
	//có thể đặt cùng tên hàm
	// Overloading : nạp chồng || ghi đè
	// + In a class >> Same Name
	// - # Number of parameters
	public static int sum(int a, int b) {
		 return a + b;
	}
	public static int sum(float a, float b) {
		 return 0;
	}
	

	public static int sum(int a, int b,int c) {
		 return a + b + c;
	}


}
