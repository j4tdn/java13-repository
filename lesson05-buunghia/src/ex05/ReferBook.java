package ex05;

public class ReferBook extends Book {
	double tax;
	public ReferBook() {}
	public ReferBook(double price,String publisher,double tax) {
		this.code="STK";
		this.price=price;
		this.publisher=publisher;
		this.tax=tax;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
}
