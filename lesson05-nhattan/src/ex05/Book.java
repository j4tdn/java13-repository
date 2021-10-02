package ex05;

public abstract class Book {
	protected String id;
	protected String unitPrice;
	protected String publicsher;
	
	public Book() {
	}

	public Book(String id, String unitPrice, String publicsher) {
		super();
		this.id = id;
		this.unitPrice = unitPrice;
		this.publicsher = publicsher;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getPublicsher() {
		return publicsher;
	}

	public void setPublicsher(String publicsher) {
		this.publicsher = publicsher;
	}
	
	
	
	
}
