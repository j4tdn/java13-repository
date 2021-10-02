package ex05;

public class Order {
	private Customer customer;
	private DetailBook[] detailBook;
	
	public Order() {
		
	}
	public Order(Customer customer, DetailBook[] detailBook) {
		this.customer = customer;
		this.detailBook = detailBook;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public DetailBook[] getDetailBook() {
		return detailBook;
	}
	public void setDetailBook(DetailBook[] detailBook) {
		this.detailBook = detailBook;
	}
	
	public long totalPrice() {
		long S = 0;
		for(int i=0;i<detailBook.length;i++) {
			S+=detailBook[i].sumPrice();
		}
		return S;
	}
}
