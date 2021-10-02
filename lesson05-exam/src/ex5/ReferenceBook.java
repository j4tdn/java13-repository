package ex5;

public class ReferenceBook extends Book{
	private int tax;
	
	public ReferenceBook() {
	}

	public ReferenceBook(String idBook, float price, String publisher, int tax) {
		super(idBook, price, publisher);
		this.tax = tax;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return super.toString() + ", " +tax;
	}
	
	@Override
	public float getBill() {
		return price * (1 + tax / 100);
	}
}
