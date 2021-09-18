package bean;

public class Vehicle {
	private String name;
	private String model;
	private int capacity;
	private float price;
	
	public Vehicle() {
		
	}

	public Vehicle(String name, String model, int capacity, float price) {
		super();
		this.name = name;
		this.model = model;
		this.capacity = capacity;
		this.price = price;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public float getTax(float price) {
		if (capacity < 100) return price/100;
		else if (capacity <= 200) return (price*3/100);
		else return (price*5/100);
	}
	@Override
	public String toString() {
		return String.format("%-30s %-20s %-10s %-20f %-10f",name,model,capacity,price,getTax(price)); 
	}
	
	
}
