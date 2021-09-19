package Ex01;

public class Vehicle {
	private String name;
	private String model;
	private double price;
	private double capacity;
	
	public Vehicle() {
	}
	
	public Vehicle(String name, String model, double price, double capacity) {
		this.name = name;
		this.model = model;
		this.price = price;
		this.capacity = capacity;
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
	
	public double getCapacity() {
		return capacity;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return name + "\t" + model + "\t" + price + "\t" + capacity+ "\t" + Tax();
	}
	
	// Hàm tính giá trị thuế dựa vào dung tích Xylanh và Giá trị của xe
	public double Tax() {
		if(capacity < 100)
			return 0.01*price;
		if (capacity >= 100 && capacity <= 200)
			return 0.03*price;
		return 0.05*price;	
	}
	
	// Hàm hiển thị giá trị thuế đã tính được
	public void printTax() {
		System.out.printf("%15s %15s %15d %15f %15f \\n ",name,model,capacity,price,Tax());
	}
}
