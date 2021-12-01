package bean;

import java.time.LocalDate;

public class Item {
	private int id;
	private String name;
	private double price;
	private LocalDate expriedDate;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int id, String name, double price, LocalDate expriedDate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.expriedDate = expriedDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getExpriedDate() {
		return expriedDate;
	}

	public void setExpriedDate(LocalDate expriedDate) {
		this.expriedDate = expriedDate;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", expriedDate=" + expriedDate + "]";
	}
	
	
}
