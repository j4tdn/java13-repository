package ex05;

public class ReferBook extends Parent{
	private float tax;
	
	public ReferBook() {
		// TODO Auto-generated constructor stub
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
