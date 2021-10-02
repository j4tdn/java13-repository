package ex5;

import java.util.Arrays;

public class Order {
	private Client client;
	private Book[] books;
	
	public Order() {
		
	}

	public Order(Client client, Book[] books) {
		super();
		this.client = client;
		this.books = books;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Order [client=" + client + ", books=" + Arrays.toString(books) + "]";
	}
	
	
	
}
