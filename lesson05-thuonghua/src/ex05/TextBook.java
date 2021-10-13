package ex05;

public class TextBook extends Book{
	private String status;
	
	public TextBook() {
	}

	public TextBook(String bookCode, int price, String publishingCompany, String status) {
		super(bookCode, price, publishingCompany);
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
