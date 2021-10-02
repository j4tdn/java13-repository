package ex05;

public class ReferBook extends Book{
	private double tax;
	
	public ReferBook() {
		
	}
	public ReferBook(String idBook, int price, String publisher, double tax) {
		super(idBook, price, publisher);
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
		return super.toString() +", "+tax;
	}
	public double totalPrice() {
		return getPrice()*(1+0.15);
	}
}
