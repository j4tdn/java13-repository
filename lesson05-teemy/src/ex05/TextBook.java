package ex05;

public class TextBook extends Book{
	private String state;
	
	public TextBook() {
	}

	public TextBook(String id,double price,String publisher,String state) {
		this.id=id;
		this.price=price;
		this.publisher=publisher;
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public double totalprice() {
		return (price/100)*70;
	}
	
	@Override
	public String toString() {
		return ""+id+","+price+","+publisher+","+state;
	}
	
	
	
}
