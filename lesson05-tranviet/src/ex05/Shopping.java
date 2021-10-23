package ex05;

public class Shopping {
	private Customer cs;
	
	// Sao em không để chung 1 mảng Book luôn mà phải tách 2
	// Trong class Book để 1 hàm getPrice rồi override lại trong
	// TextBook và ReferenceBook
	// Lúc compile cứ gọi getPrice rồi runtime nó sẽ vào TextBook hoặc ReferenceBook để tính
	private Book[] books;

	public Shopping() {
	}

	public Shopping(Customer cs, Book[] books) {
		this.cs = cs;
		this.books = books;
	}

	public Customer getCs() {
		return cs;
	}

	public void setCs(Customer cs) {
		this.cs = cs;
	}

	public Book[] getBooks() {
		return books;
	}
	
	public void setBooks(Book[] books) {
		this.books = books;
	}
}
