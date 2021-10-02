package ex05;

public class Book {
	protected String id;
	protected double price;
	protected String publisher;	
	
	@Override
	public String toString() {
		return ""+id+","+price+","+publisher;
	}
}
