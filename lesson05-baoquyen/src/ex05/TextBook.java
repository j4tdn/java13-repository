package ex05;

public class TextBook extends Book {
	private String status;
	
	public TextBook() {
		
	}

	public TextBook(String id, double cost, String publisher, String status) {
		super(id, cost, publisher);
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
		return  super.toString()+ " ,tatus=" + status ;
	}
	
	 
}
