package bean;

public class Calculator {
	private int a;
	private int b;
	
	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	//Phuong thuc sum: khong ph thuoc vao doi tuong dang goi
	public int sum() {
		return a + b;
	}
}
