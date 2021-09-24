package polymophism.method;

public class MathUtils {
	private MathUtils() {
		
	}
	
	//Overloading
	
	//+ In a class: Same method name
	//- # Number of parameters
	//- # Data Type of parameters
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sum(float a, float b) {
		return 0;
	}
	
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
}
