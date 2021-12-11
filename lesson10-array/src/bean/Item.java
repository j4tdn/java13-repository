package bean;

import java.time.LocalDate;

public class Item implements Comparable<Item>{
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

	public LocalDate getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(LocalDate expiredDate) {
		this.expiredDate = expiredDate;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", expiredDate=" + expiredDate + "]" + "\n";
	}

	@Override
	// compare 2 items
	// 1: this: previous item
	// 2: that: next item
	
	// each : item
	// compare >> (id) || name || price
	public int compareTo(Item that) {
		//return this.getId() - that.getId();
		//return this.getName().compareTo(that.getName());
		if(this.getPrice() - that.getPrice() > 0) return 1;
		if(this.getPrice() - that.getPrice() < 0) return -1;
		return this.getId() - that.getId();
	}
}
