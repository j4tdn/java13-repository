package bean;

public class Draft {
	public static void main(String[] args) {
		Car car =new Car("12","ab","yelow");
		System.out.println(car.getColor());
		
		Car car1 =null;
		System.out.println(car1.getColor());
	}
}
