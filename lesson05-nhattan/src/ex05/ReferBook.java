package ex05;

public class ReferBook extends Book{
	private int tax;

	public ReferBook() {
		super();
	}

	public ReferBook(int tax) {
		super();
		this.tax = tax;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}
	
	
}
