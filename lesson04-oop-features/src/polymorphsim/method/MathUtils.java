package polymorphsim.method;

public class MathUtils {
	private MathUtils() {
		
	}
	//overloading
	
	// + In a class >> same name
	// - # number of parameters
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
