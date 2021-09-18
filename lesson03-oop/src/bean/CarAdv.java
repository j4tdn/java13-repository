package bean;

public class CarAdv {
	
	// static >> initial value when class is being loaded
	// non-static >>  initial value when init an object from class
	
	// static things will be created before non-static things
	
	private String color;
	//private --> use in this class only
	public static String model;
	
	public CarAdv() {
	}
	
	public CarAdv(String color) {
		super();
		this.color = color;
	}
	
	// no getter, setter for static attributes
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
/*
	public static String getModel() {
		return model;
	}

	public static void setModel(String model) {
		CarAdv.model = model;
	}
*/
	
	// static >> non-static
	public static void exportCarInfo() {
		System.out.println(model);
		//System.out.println(color);
		//printCarInfo();
	}
	
	// static >> non-static
	public void printCarInfo() {
		System.out.println(model);
		System.out.println(color);
		exportCarInfo();
	}
	
	@Override
	public String toString() {
		return model + ", " + color;
	}
}
