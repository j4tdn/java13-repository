package ex05;

public class DetailBook {
	private Book book;
	private int quantity;
	public DetailBook() {
		
	}
	public DetailBook(Book book, int quantity) {
		this.book = book;
		this.quantity = quantity;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	public double sumPrice() {
		return book.totalPrice()*quantity;
	}
}
