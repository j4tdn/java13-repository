package bean;

public class Calculator {
	
	private int a;
	private int b;
		
	public Calculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int sum() {
		return a + b;
	}
}
