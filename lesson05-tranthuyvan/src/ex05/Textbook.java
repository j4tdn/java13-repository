package ex05;

public class Textbook extends Book {
	private String status;
	
	public Textbook() {
	}

	public Textbook(String idOfBook, double cost, String placeOfPub, String status) {
		super(idOfBook, cost, placeOfPub);
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
		return super.toString() + ", status: " + status;
	}
	
	

}
