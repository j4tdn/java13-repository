package bean;

public class Calculator {
	private int first;
	private int second;
	
	public Calculator() {
	
	}
	
	public Calculator(int first, int second) {

		this.first = first;
		this.second = second;
	}


	public int sum() {
		return first + second;
	}
}
