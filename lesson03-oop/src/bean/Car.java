package bean;

public class Car {
	// attributes, constructor, getter setter, hashcode, equals, toString 
	private String serial;
	private String model;
	private String color;
	
	// double luôn có giá trị, mặc định là 0d
	// Double chưa có giá trị -null, có giá trị 0 hoặc một giá trị bất kì
	private Double price;
	
	public Car() {
	}
	
	// required
	public Car(String serial, String model) {
		// this.serial = serial;
		// this.model = model;
		
		this(serial, model, null);
	}
	
	// required
	public Car(String serial, String model, String color) {
		// this.serial = serial;
		// this.model = model;
		// this.color = color;
		this(serial, model, color, null);
	}
	
	public Car(String serial, String model, String color, Double price) {
		this.serial = serial;
		this.model = model;
		this.color = color;
		this.price = price;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		// this >> a car
		// true when 2 car have the same serial
		if (this == obj) {
			return true;
		}
		
		// obj >> not a car
		if (!(obj instanceof Car)) {
			return false;
		}
		
		// obj >> a car
		Car that = (Car)obj;
	
		return getSerial() == null ? false :
			getSerial().equals(that.getSerial());
	}
	
	@Override
	public String toString() {
		return serial + ", " + model + ", " + color;
	}
}
