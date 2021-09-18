package bean;

public class CarAdv {
	
	// Static >> initial value when class is being loaded
	// Non-static >> initial value when init an object from class
	
	// static things will be created before non-static things
	public static String model;
	private String color;
	public CarAdv() {
	}

	public CarAdv(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public static void exportCarInfo() {
		System.out.println(model);
	}
	
	public void printCarInfo() {
		System.out.println(model);
		System.out.println(color);
		exportCarInfo();
	}
	@Override
	public String toString() {
		return model + "," + color;
	}


}
