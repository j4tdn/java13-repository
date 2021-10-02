package ex05;

public abstract class Book {
	private String idBook;
	private int price;
	private String publisher;
	
	public Book () {
		
	}
	public Book(String idBook, int price, String publisher) {
		this.idBook = idBook;
		this.price = price;
		this.publisher = publisher;
	}
	public String getIdBook() {
		return idBook;
	}
	public void setIdBook(String idBook) {
		this.idBook = idBook;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	abstract double totalPrice();
	@Override
	public String toString() {
		return idBook+", "+ price + ", "+ publisher;
	}
	public boolean checkPublisher() {
		if(publisher=="Nhi Đồng") return true;
		return false;
	}
	public boolean checkPriceLessThan50() {
		if(price<50) return true;
		return false;
	}
	public boolean priceBetween100And200() {
		if(price>=100 && price<=200) return true;
		return false;
	}
	
}
