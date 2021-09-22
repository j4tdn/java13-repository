package polymorphism.method;

public class MathUtils {
	//Tạo ra những cái hàm static để sử dụng đâu cũng được
	
	private MathUtils() {
	}
	//Overloding : 2 phương thức trùng tên cùng chức năng hoặc cùng tên mà khác tham số truyền vào
	//+ in a class =>> same name
	// # number of parameters
	//data type of parameters
	
	public static int sum(int a, int b) {
		return a + b;
	}
	public static float sum(float a, float b) {
		return a + b;
	}
	
	public static int sum(int a, int b , int c) {
		return a + b + c;
	}
}
