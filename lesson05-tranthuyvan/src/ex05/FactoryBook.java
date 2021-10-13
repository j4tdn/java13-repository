package ex05;

// Factory pattern >> good
public class FactoryBook {
	public static Book createTextbook(String idOfBook, double cost, String placeOfPub, String status) {
		return new Textbook(idOfBook, cost, placeOfPub, status);
	}
	
	public static Book createReferBook(String idOfBook, double cost, String placeOfPub, double tax) {
		return new ReferBook(idOfBook, cost, placeOfPub, tax);
	}

}
