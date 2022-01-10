package bean;

import java.time.LocalDate;

public class Item {
	private int id;
	private String name;
	private double price;
	private LocalDate expiredDate;
	
	public Item() {
		
	}

	public Item(int id, String name, double price, LocalDate expiredDate) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.expiredDate = expiredDate;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public LocalDate getExpiredDate() {
		return expiredDate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setExpiredDate(LocalDate expiredDate) {
		this.expiredDate = expiredDate;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	//@Override
	// compare 2 items
	//public int compareTo(Item that) {
		//return this.getPrice() - that.getPrice();
	//}
	
	

}
