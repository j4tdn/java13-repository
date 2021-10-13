package ex05;

public class ReferBook extends Book{
	private float tax;
	
	public ReferBook() {
	}

	public ReferBook(String id, float price, String publisher, float tax) {
		super(id, price, publisher);
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
		return this.id + ", " + this.price + ", " + this.publisher + ", " +this.tax;

	}
	
	
	
	
}
