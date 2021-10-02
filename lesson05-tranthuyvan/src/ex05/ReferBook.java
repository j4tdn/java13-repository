package ex05;

public class ReferBook extends Book {
	private double tax;
	
	public ReferBook() {
	}

	public ReferBook(String idOfBook, double cost, String placeOfPub, double tax) {
		super(idOfBook, cost, placeOfPub);
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
		return super.toString() + ", tax: " + tax;
	}
	

}
