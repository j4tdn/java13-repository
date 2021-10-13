package ex05;

public class Book {
	protected int id;
	protected double price;
	protected String author;
	
	public Book() {
		// Nhớ xóa những đoạn code, import thừa
	}

	public Book(int id, double price, String author) {
		this.id = id;
		this.price = price;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public double getPrice() {
		return price;
	}

	public String getAuthor() {
		return author;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + ", author=" + author + "]";
	}

	
}
