package ex05;

public class TextBook extends Book{
	private String status;
	
	public TextBook() {
		
	}
	public TextBook(String idBook, int price, String publisher, String status) {
		super(idBook, price, publisher);
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return super.toString() +", "+status;
	}
	public double totalPrice() {
		if(status=="new") return getPrice();
		return getPrice()*0.7;
	}
}
