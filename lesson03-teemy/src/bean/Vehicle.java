package bean;

public class Vehicle {
	private String ownerName;
	private String brand;
	private int capacity;
	private double value;
	
	public Vehicle() {
	}

	public Vehicle(String ownerName, String brand, int capacity, double value) {
		this.ownerName = ownerName;
		this.brand = brand;
		this.capacity = capacity;
		this.value = value;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	public double duty() {
		if(capacity <100) return value*0.01;
		if(capacity <200) return value*0.03;
		return value*0.05;
	}
	
	@Override
	public String toString() {
		return ownerName+","+brand+"'"+value+","+capacity;
	}
	
	
}
