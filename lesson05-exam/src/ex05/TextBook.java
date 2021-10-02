package ex05;

public class TextBook extends Book{
	private String condition;
	
	public TextBook() {
	
	}

	public TextBook(String id, int price, String publishingCompany, String condition) {
		super("SGK" + id, price, publishingCompany);
		this.condition = condition;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	@Override
	public String toString() {
		return "TextBook: " + super.toString() + "[condition=" + condition;
	}

	@Override
	public double bill() {
		if("old".equalsIgnoreCase(condition)) {
			return getPrice() * 0.7;
		}
		
		return getPrice();
	}
	
	
}
