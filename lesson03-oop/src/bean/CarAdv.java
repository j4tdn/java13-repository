package bean;

public class CarAdv {
	private String color;
	private static String model;
	public CarAdv() {
	}
	public CarAdv(String color, String model) {
		this.color = color;
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	// static >> non-static
	public static void exportCarInfo() {
		System.out.println(model);
//		System.out.println(color);
//		printCarInfo();
	}
	// static >> non static
	public void printCarInfo() {
		System.out.println(model);
		System.out.println(color);
		exportCarInfo();
	}
	@Override
	public String toString() {
		return "color = " + color + ", model=" + model;
	}
	
}
