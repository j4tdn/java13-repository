package bean;

public class Car {
	private String serial;
	private String model;
	private String color;
	private Double price;
	
	
	
public Car() {
	// TODO Auto-generated constructor stub
}
	public Car(String serial, String model, String color) {
//		this.serial = serial;
//		this.model = model;
//		this.color = color;
		this(serial, model, color, null);
	}
	public Car(String serial, String model, String color, Double price) {
//		this(serial, model, color);
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
		// this >> car
		// true when 2 car have the same serial
		
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Car)) {
			return false;
		}
		
		// obj >> car
		Car that = (Car)obj;
		 return getSerial() == null? false: getSerial().equals(that.getSerial());
	}

	@Override
	public String toString() {
		return serial + ", " + model + ", "+ color;
	}
	
	
	
}
