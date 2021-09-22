package polymorphism.method;

public class MathUtils {
	private MathUtils() {

	}

	// Overloading

	// + In a class >> Same Name
	// - # Number of parameters
	// - # Data type of parameters

	public static int sum(int a, int b) {
		return a + b;
	}

	public static float sum(float a, float b) {
		return 0;
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
}
