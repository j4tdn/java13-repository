package bean;

import java.time.LocalDate;

public class Item {
private int id;
private String name;
private double price;
private LocalDate expireDate;
public Item(int id, String name, double price, LocalDate expireDate) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.expireDate = expireDate;
}
public Item() {
	super();
	
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
public LocalDate getExpireate() {
	return expireDate;
}
public void setExpireDate(LocalDate expiredate) {
	this.expireDate = expiredate;
}



}
