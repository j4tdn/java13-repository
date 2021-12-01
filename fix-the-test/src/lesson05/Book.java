package lesson05;

public class Book {
	private String id;
	private double price;
	private String pulisher;
	public Object getPulisher;

	public Book() {
	}

	public Book(String id, double price, String pulisher) {
		this.id = id;
		this.price = price;
		this.pulisher = pulisher;
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
		return pulisher;
	}

	public void setPulisher(String pulisher) {
		this.pulisher = pulisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + ", pulisher=" + pulisher + "]";
	}

}
