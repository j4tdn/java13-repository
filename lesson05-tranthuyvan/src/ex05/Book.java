package ex05;

public class Book {
	private String idOfBook;
	private double cost;
	private String placeOfPub; // Place of publication
	
	public Book() {
	}

	public Book(String idOfBook, double cost, String placeOfPub) {
		this.idOfBook = idOfBook;
		this.cost = cost;
		this.placeOfPub = placeOfPub;
	}

	public String getIdOfBook() {
		return idOfBook;
	}

	public void setIdOfBook(String idOfBook) {
		this.idOfBook = idOfBook;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getPlaceOfPub() {
		return placeOfPub;
	}

	public void setPlaceOfPub(String placeOfPub) {
		this.placeOfPub = placeOfPub;
	}
	
	@Override
	public String toString() {
		return "Book [idOfBook=" + idOfBook + ", cost=" + cost + ", placeOfPub=" + placeOfPub + "]";
	}

}
