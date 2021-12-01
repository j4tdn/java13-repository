package lesson05;

public class PublicherCondition implements Condition {
	private String name;
	
	public PublicherCondition(String name) {
		this.name = name;
	}

	@Override
	public boolean check(Book book) {
		return name.equals(book.getPulisher());
	}
}
