package view;

import bean.Car;

/**
 * Printout all cars have color = Black
 */
public class Ex08 {
	public static void main(String[] args) {
		Car c1 = new Car("S1", "M1", "Black", 1500d);
		Car c2 = new Car("S2", "M2", null, 800d);
		Car c3 = new Car("S3", "M3", "Black", 1200d);
		Car c4 = new Car("S4", "M4", "White", 1800d);
		
		Car[] cars = {c1, c2, c3, c4};
		
		// foreach
		for(Car car: cars) {
			if("Black".equals(car.getColor())) {
				System.out.println(car);
			}
		}		
	}	
}
