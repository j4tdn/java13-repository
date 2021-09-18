package bean;

public class CarAdv {
	//static >>initial value when class is being loaded
	//non-static>>initial value when init an object from class
	
	public static  String model;
	
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
	public static void exportCarInfor() {
		System.out.println(model);
//		System.out.println(color);
//		printCarInfor();
	}
	
	public void printCarInfor() {
		System.out.println(model);
		System.out.println(color);
		exportCarInfor();
	}
	
	@Override
	public String toString() {
		return model+","+color;
	}
	
}
