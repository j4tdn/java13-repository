package bean;

import java.time.LocalDate;

public class Item {
	private int id;
	private String name;
	private double price;
	private LocalDate expriredDate;
	
	public Item() {
	}
	
	

	public Item(int id, String name, double price, LocalDate expriredDate) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.expriredDate = expriredDate;
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

	public LocalDate getExpriredDate() {
		return expriredDate;
	}

	public void setExpriredDate(LocalDate expriredDate) {
		this.expriredDate = expriredDate;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", expriredDate=" + expriredDate + "]";
	}
	
	
}
