package ex01;

public class Vehicle {
	private String carOwner;
	private String type;
	private int capacity;
	private double value;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String carOwner, String type, int capacity, double value) {
		super();
		this.carOwner = carOwner;
		this.type = type;
		this.capacity = capacity;
		this.value = value;
	}

	public String getCarOwner() {
		return carOwner;
	}

	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
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
		if(capacity <= 0) {
			return Double.NaN;
		}
		if(capacity < 100) {
			return value*1/100;
		}
		else if(100 <= capacity && capacity <= 200) {
			return value*3/100;
		}
		else {
			return value*5/100;
		}
	}
}
