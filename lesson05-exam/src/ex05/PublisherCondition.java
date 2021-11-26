package ex05;

public class PublisherCondition implements Condition {
	String name;
	
	public PublisherCondition(String name) {
		this.name = name;
	}
	@Override
	public boolean check(Book book) {
		return name.equals(book.getPulisher());
	}

}