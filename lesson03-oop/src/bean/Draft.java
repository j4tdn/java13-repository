package bean;

public class Draft {
	public static void main(String[] args) {
		Car car = new Car("12", "ab", "yellow");
		System.out.println(car.getColor());
		
		// NullPointer, Error first
		/*
		 * Car car1 = null; System.out.println(car1.getColor());
		 */
		
		String s1 = null;
		System.out.println(s1.equals("..."));
	}
}
