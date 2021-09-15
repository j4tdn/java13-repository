package bean;

public class CarAdv {
	
	//static >> initial value when class is being loaded
	//non-static >>initial value when initial an object from class
	//static things will be created before non-static things
	
	public static String model;
	
	private String color;
	
	public CarAdv() {}
	
	public CarAdv(String color) {
		this.color = color;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

//	public String getModel() {
//		return model;
//	}
//
//	public void setModel(String model) {
//		this.model = model;
//	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return model + ", " + color;
	}
	
	
}
