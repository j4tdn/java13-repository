package bean;

public class Vehicle {
	private String namecar;
	private String modelcar;
	private int capacity;
	private float price;
	
	public Vehicle() {
		
	}

	
	
	public Vehicle(String namecar, String modelcar, int capacity, float price) {
		super();
		this.namecar = namecar;
		this.modelcar = modelcar;
		this.capacity = capacity;
		this.price = price;
	}

	


	public String getNamecar() {
		return namecar;
	}



	public void setNamecar(String namecar) {
		this.namecar = namecar;
	}



	public String getModelcar() {
		return modelcar;
	}



	public void setModelcar(String modelcar) {
		this.modelcar = modelcar;
	}



	public int getCapacity() {
		return capacity;
	}



	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}



	public float getPrice() {
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
		return String.format("%-30s %-20s %-10s %-20f %-10f",namecar,modelcar,capacity,price,getTax(price)); 
	}
	
	
}
