package homework;

public class Vehicle {
	private String namecustumers;
	private String type;
	private int capacity;
	private double price;
	
	public Vehicle() {
	}

	public Vehicle(String namecustumers, String type, int capacity, double price) {
		this.namecustumers = namecustumers;
		this.type = type;
		this.capacity = capacity;
		this.price = price;
	}

	public String getNamecustumers() {
		return namecustumers;
	}

	public void setNamecustumers(String namecustumers) {
		this.namecustumers = namecustumers;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public double tax(){
        double tax;
        if(capacity<100) tax=price*0.01;
        else if (capacity >= 100 && capacity<=200) tax = price * 0.03;
        else tax = price * 0.05;
        return tax;
    }

	@Override
	public String toString() {
		return "Vehicle [namecustumers=" + namecustumers + ", type=" + type + ", capacity=" + capacity + ", price="
				+ price + "]";
	}

	void printfV(){
        System.out.printf("%5d %-20s %5d %10.2f %10s %8.5f \n ",namecustumers,type,capacity,price,tax());
    }

	
}
