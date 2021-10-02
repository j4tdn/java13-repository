package ex5;

public class FactoryBook {
	public static Book CreateReferenceBook(String idBook, float price, String publisher, int tax) {
		return new ReferenceBook(idBook, price, publisher, tax);
	}
	
	public static Book CreateTextBook(String idBook, float price, String publisher, boolean status) {
		return new Textbook(idBook, price, publisher, status); 
	}
}
