package bean;

public class CarAdv {
	private String serial;
	private String model;
	private String color;
	
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.getColor = color;
	}
	
	public static void exportCarInfo() {
		System.out.println(model);
	}
	
	public void printCarInfo() {
		System.out.println(model);
		System.out.println(color);
		exportCarInfo();
	}
}
