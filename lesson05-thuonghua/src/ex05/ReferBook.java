package ex05;

public class ReferBook extends Book{
	private float tax;
	
	public ReferBook() {
	}

	public ReferBook(String bookCode, int price, String publishingCompany, float tax) {
		super(bookCode, price, publishingCompany);
		this.tax = tax;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}
	
	
}
