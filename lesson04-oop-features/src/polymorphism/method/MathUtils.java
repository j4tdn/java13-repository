package polymorphism.method;

public class MathUtils {
	private MathUtils() {
		
	}
	
	// Overloading 
	// (hai hàm cùng tên nhưng khác số lượng tham số hoặc data type truyền vào)
	// + In a class >> Same Name
	// - # Number of parameters
	// - # Data type of parameter
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static float sum(float a, float b) {
		return a + b;
	}
	
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
}
