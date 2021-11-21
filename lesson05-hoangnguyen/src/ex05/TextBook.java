package ex05;

public class TextBook extends Book{
	private Status status;
	
	public TextBook() {
	}

	public TextBook(String id, double price, String pulisher, Status status) {
		super(id, price, pulisher);
		this.status = status;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return super.toString() + ", status = " + status;
	}
	
	
}
