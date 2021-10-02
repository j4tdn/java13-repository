package ex5;

public class Textbook extends Book{
	private boolean status;
	
	public Textbook() {
	}

	
	
	public Textbook(String idBook, float price, String publisher, boolean status) {
		super(idBook, price, publisher);
		this.status = status;
	}

	

	public boolean isStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}

	

	@Override
	public String toString() {
		return super.toString() + ", " + status;
	}



	@Override
	public float getBill() {
		return status == true ? price : price * 0.3f;
	}
}
