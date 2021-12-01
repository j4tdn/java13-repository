package bean;

import java.time.LocalDate;

public class Item {
	private int id;
	private double price;
	private LocalDate expriredDate;
	
	public Item() {
	}

	public Item(int id, double price, LocalDate expriredDate) {
		super();
		this.id = id;
		this.price = price;
		this.expriredDate = expriredDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Item [id=" + id + ", price=" + price + ", expriredDate=" + expriredDate + "]";
	}
	
	

}
