package polymorphism.method;

public class MathUtils {
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
