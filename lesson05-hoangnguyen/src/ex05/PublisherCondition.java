package ex05;

public class PublisherCondition implements Condition {
	
	private String publisher;
	
	public PublisherCondition() {}
	
	public PublisherCondition(String publisher) {
		this.publisher = publisher;
	}
	
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public boolean check(Book book) {

		return publisher.equalsIgnoreCase(book.getPulisher());
	}
}
