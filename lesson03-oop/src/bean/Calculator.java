package bean;

public class Calculator {
	
	private int a;
	private int b;
	
	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	// Phương thức sum: phụ thuộc vào đối tượng đang gọi >> nên để non-static
	public int sum() {
		return a + b;
	}
}
