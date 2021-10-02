package ex05;

import java.util.Arrays;

public class Order {
	private Book books;
	private int quantity;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Book textbook, int quantity) {
		this.books = textbook;
		this.quantity = quantity;
	}

	public Book getBooks() {
		return books;
	}

	public void setBooks(Book books) {
		this.books = books;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Order [books=" + books + ", quantity=" + quantity + "]";
	}

	
	
	
	
}
