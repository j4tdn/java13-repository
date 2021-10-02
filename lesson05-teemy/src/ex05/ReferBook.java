package ex05;

public class ReferBook extends Book {
	private double tax;
	
	public ReferBook() {
	}

	public ReferBook(String id,double price,String publisher,double tax) {
		this.id=id;
		this.price=price;
		this.publisher=publisher;
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double totalprice() {
		return price*(1+tax/100);
	}

	@Override
	public String toString() {
		return ""+id+","+price+","+publisher+","+tax;
	}
	
}
