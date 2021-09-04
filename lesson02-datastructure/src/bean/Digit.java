package bean;

public class Digit {
	public int value;
	
	public Digit(int pValue) {
		this.value = pValue;
	}
	
	@Override
	public String toString() {
		return "" + this.value;
	}
}
