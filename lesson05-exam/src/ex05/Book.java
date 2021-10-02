package ex05;

public abstract class Book {
	private String id;
	private int price;
	private String publishingCompany;
	
	public Book() {
	
	}

	public Book(String id, int price, String publishingCompany) {
		this.id = id;
		this.price = price;
		this.publishingCompany = publishingCompany;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
	
	public abstract double bill();

	@Override
	public String toString() {
		return "id=" + id + ", price=" + price + ", publishingCompany=" + publishingCompany;
	}
	
	
}
