package polymorphism.method;

public class MathUtils {
	private MathUtils() {
		
	}
	
	// Over loading
	// + In a class >> Same name
	// - # Number of parameter
	// - # Data type of parameters
	
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
