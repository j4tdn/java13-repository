package bean;

public class CarAdv {
	
	// static >> initial value when class is being loaded
	// non-static >> initial when init an object from class
	
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

	@Override
	public String toString() {
		return model + ", " + color;
	}
	
	 
}
