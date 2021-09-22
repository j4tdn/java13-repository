package bean;

public class Car {
	private String serial;
	private String model;
	private String color;
	
	public Car() {
		
	}
	public String getModel() {
		this.model = model;
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
		
	}
	public String toString() {
		return serial + "," + model + color ;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Car)) {
			return false;
		}
		Car that = (Car)obj;
		return getSerial() ==null ? false
	}
}
