package bean;

public class Calculator {
	
	private int a;
	private int b;

	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	//non-static: 
	public int sum(int a, int b) {
		return a + b;
	}

}
