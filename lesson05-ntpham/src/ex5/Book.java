package ex5;

public abstract class Book {
	protected String idBook; // bookId
	protected float price;
	protected String publisher;
	
	public Book() {
	}

	public Book(String idBook, float price, String publisher) {
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return idBook + ", " + price + ", " + publisher;
	}
	
	public abstract float getBill();
}
