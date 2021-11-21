package ex05_review;

public class Book {

	private String id;
	private double price;
	private String publisher;
	
	public Book() {
		
	}

	public Book(String id, double price, String publisher) {
		this.id = id;
		this.price = price;
		this.publisher = publisher;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPulisher() {
		return publisher;
	}

	public void setPulisher(String pulisher) {
		this.publisher = pulisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + ", pulisher=" + publisher + "]";
	}
	
}
