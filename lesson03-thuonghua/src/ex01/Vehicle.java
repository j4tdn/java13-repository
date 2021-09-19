package ex01;

public class Vehicle {
	private String name;
	private String carName;
	private int capacity;
	private long price;
	private long tax;
	
	public Vehicle() {
		
	}

	public Vehicle(String name, String carName, int capacity, long price, long tax) {
		this.name = name;
		this.carName = carName;
		this.capacity = capacity;
		this.price = price;
		this.tax = tax;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public long getTax() {
		
		if(capacity < 100) {
			tax = price*1/100;
		} else if(capacity >= 100 && capacity <= 200) {
			tax = price*3/100;
		} else {
			tax = price*5/100;
		}
		
		return tax;
	}

	public void setTax(long tax) {
		this.tax = tax;
	}
	
	
	@Override
	public String toString() {
		return name + "-"+carName + "-"+ capacity + "-"+ price + "-"+ tax;
	}
	void inThue(){
        System.out.printf(" %-25s%-25s%-25s%-25s%s\n",name, carName, capacity, price, getTax());
    }
}
