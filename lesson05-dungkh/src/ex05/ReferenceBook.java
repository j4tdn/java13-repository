package ex05;

public class ReferenceBook extends Book {
	private double tax;
	
	public ReferenceBook() {
		// TODO Auto-generated constructor stub
	}

	public ReferenceBook(int id, double price, String author,double tax) {
		super(id, price, author);
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
		return "ReferenceBook [getId()=" + getId() + ", getPrice()=" + getPrice() + ", getAuthor()=" + getAuthor()
				+ ", tax=" + tax + "]";
	}
	
	

}
