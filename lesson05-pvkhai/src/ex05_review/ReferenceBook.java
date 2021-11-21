package ex05_review;

public class ReferenceBook extends Book{
private double tax;
	
	public ReferenceBook() {
	}

	public ReferenceBook(String id, double price, String pulisher, double tax) {
		super(id, price, pulisher);
		this.tax = tax;
	}
	
	public double getTax() {
		return tax;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	@Override
	public String toString() {
		return super.toString() + " >> tax = " + tax;
	}
}
