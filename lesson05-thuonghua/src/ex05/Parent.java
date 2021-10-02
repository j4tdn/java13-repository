package ex05;

public class Parent {
	private String bookCode;
	private int price;
	private String publishingCompany;
	
	public Parent() {
		// TODO Auto-generated constructor stub
	}
	
	public Parent(String bookCode, int price, String publishingCompany) {
		super();
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
