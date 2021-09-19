package bean;

public class Vehicle {
	
	private String owner;
	private String model;
	private float capacity;
	private double value;
	
	
	public Vehicle() {}

	public Vehicle(String owner, String model, float capacity, double value) {
		
		this.owner = owner;
		this.model = model;
		this.capacity = capacity;
		this.value = value;
		
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getCapacity() {
		return capacity;
	}

	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double tax() {
		double tax;
		if(capacity < 100) return tax=value*0.01;
		else if(capacity>=100 && capacity<=200) return tax=value*0.03;
		else tax=value*0.05;
		return tax;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.owner + "\t" + this.model + "\t" + this.capacity + "\t" + this.value +"\t" + tax() ;
	}
	
}
