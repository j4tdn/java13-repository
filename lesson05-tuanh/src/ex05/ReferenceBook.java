package ex05;


public class ReferenceBook extends Book {
	private double tax;

	public ReferenceBook() {
		
	}
	
	public ReferenceBook(String bookCode, Double price, String bookSource,double tax) {
		super();
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
		return "ReferenceBook: tax = " + tax;
	}

}
