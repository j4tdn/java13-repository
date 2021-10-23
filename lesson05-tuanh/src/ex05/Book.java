package ex05;

public class Book {
	private String bookCode;
	private Double Price; // price >> tên biến 1 chữ viết thường
	private String bookSource;
	
	public Book() {
		
	}
	
	public Book(String bookCode, Double price, String bookSource) {
		this.bookCode = bookCode;
		Price = price;
		this.bookSource = bookSource;
	}

	public String getBookCode() {
		return bookCode;
	}

	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public String getBookSource() {
		return bookSource;
	}

	public void setBookSource(String bookSource) {
		this.bookSource = bookSource;
	}

	@Override
	public String toString() {
		return "Book : bookCode = " + bookCode + "; Price=" + Price + "; bookSource=" + bookSource;
	}
	
}
