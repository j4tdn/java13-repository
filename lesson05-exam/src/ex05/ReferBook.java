package ex05;

public class ReferBook extends Book{
	private float tax;
	
	public ReferBook() {
	
	}

	public ReferBook(String id, int price, String publishingCompany, float tax) {
		super("STK" + id, price, publishingCompany);
		this.tax = tax;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}
	

	@Override
	public String toString() {
		return "ReferBook" + super.toString() + "tax=" + tax;
	}

	public double bill() {
		return getPrice() * (1 + tax);
	}
	
}
