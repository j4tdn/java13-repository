package exercises1;

public class Vehicle {
	private String ownerName;
	private String type;
	private int capacity;
	private double value;
	
	public Vehicle() {
		
	}

	public Vehicle(String ownerName, String type, int capacity, double value) {
		super();
		this.ownerName = ownerName;
		this.type = type;
		this.capacity = capacity;
		this.value = value;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
	
	public double getTax() {
		if (capacity < 100) return value * 0.01;
		else if (capacity > 200) return value * 0.05;
		return value * 0.03; 
	}
}
