package polymorphism.method;

public class MathUtils {
	
	private MathUtils() {}
	
	// Overloading
	// + In a class >> Same method name
	// + Different number of parameters
	// + Different data type of parameters
	public static int sum(int a , int b) {
		return a + b;
	}
	
	public static float sum(float a, float b) {
		return a + b;
	}
	
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
}
