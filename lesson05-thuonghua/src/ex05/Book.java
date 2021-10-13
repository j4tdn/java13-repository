package ex05;

// Tên class nên là Book
public class Book {
	private String bookCode;
	private int price;
	private String publishingCompany;
	
	public Book() {
	}
	
	public Book(String bookCode, int price, String publishingCompany) {
		this.bookCode = bookCode;
		this.price = price;
		this.publishingCompany = publishingCompany;
	}



	public String getBookCode() {
		return bookCode;
	}

	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}
	
	
}
