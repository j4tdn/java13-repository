package ex05;

public class TextBook extends Parent{
	private String status;
	
	public TextBook() {
		// TODO Auto-generated constructor stub
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
