package bean;

public class Vehicle {
	private String name;
	private String model;
	private Double capacity;
	private Double price;
	
	public Vehicle() {
	}

	public Vehicle(String name, String model, Double capacity, Double price) {
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

	public Double getCapacity() {
		return capacity;
	}

	public void setCapacity(Double capacity) {
		this.capacity = capacity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double tax() {
		if(capacity < 100d) {
			return price * 0.01;
		}else if(capacity >= 100 && capacity <= 200) {
			return price * 0.03;
		}else {
			return price * 0.05;
		}
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " " + this.model + " " + this.capacity + "" + this.price + tax();
	}
	
}
