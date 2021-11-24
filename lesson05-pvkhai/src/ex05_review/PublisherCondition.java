package ex05_review;

public class PublisherCondition implements Condition{
	private String name;
	
	public PublisherCondition(String name) {
		this.name = name;
	}
	
	@Override
	public boolean check(Book book) {
		// TODO Auto-generated method stub
		return name.equals(book.getPulisher());
	}
}
