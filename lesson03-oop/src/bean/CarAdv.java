package bean;

public class CarAdv {
	private String color;
	public  static String model;
	
	public CarAdv() {
		// TODO Auto-generated constructor stub
	}

	

	public CarAdv(String color) {
		this.color = color;
	}
	//static
	public static void exportCarInfor() {
		System.out.println(model);
		
	}
	// non-static 
	public void PrintCarInfor() {
		System.out.println(model);
		System.out.println(color);
		exportCarInfor();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return model + ", "+ color;
	}
	 
	
}
