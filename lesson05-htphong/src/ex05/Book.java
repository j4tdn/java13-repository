package ex05;

public abstract class Book {
	private String idBook;
	private int price;
	private String publisher;

	public Book() {

	}

	public Book(String idBook, int price, String publisher) {
		this.idBook = idBook;
		this.price = price;
		this.publisher = publisher;
	}

	public String getIdBook() {
		return idBook;
	}

	public void setIdBook(String idBook) {
		this.idBook = idBook;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	abstract double totalPrice();

	@Override
	public String toString() {
		return idBook + ", " + price + ", " + publisher;
	}

	public boolean checkPublisher() {
		// A dặn ở lớp khá nhiều là phải dùng equals khi compare đối tượng
		return "Nhi Đồng".equals(publisher);
	}

	public boolean checkPriceLessThan50() {
		return price < 50;
	}

	public boolean priceBetween100And200() {
		return price >= 100 && price <= 200;
	}

}
