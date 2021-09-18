package bean;

public class Calculator {
	
//	Phương thức static sum: không phụ thuộc vào đối tượng đang gọi
//	public static int sum(int a, int b) {
//		return a + b;
//	}
	
	private int a;
	private int b;
	
	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int sum() {
		return a + b;
	}
	
}
