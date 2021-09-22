package ex01;

public class Vehicle {
	private String name;
	private String model;
	private int capacity;
	private int price;
	public Vehicle() {}
	public Vehicle(String name,String model,int capacity,int price) {
		this.name=name;
		this.model=model;
		this.capacity=capacity;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTax(){
		if (capacity<100) return price/100;
		if (capacity<200) return 3*price/100;
		return price/20;
	}
	@Override
	public String toString() {
		return String.format("%-25s%-15s%-10d%-15d%-15d",name,model,capacity,price,getTax());
	}
}
