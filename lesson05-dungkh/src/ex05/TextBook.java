package ex05;

public class TextBook extends Book {
	private String status;
	
	public TextBook() {
	}

	public TextBook(int id, double price, String author,String status) {
		super(id, price, author);
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
		return "TextBook [getId()=" + getId() + ", getPrice()=" + getPrice() + ", getAuthor()=" + getAuthor()
				+ ", status=" + status + "]";
	}		
}
