package view;

import bean.Car;

/**
 * Printout all cars have price > 1000
 */

public class Ex08 {
	public static void main(String[] args) {
		Car c1 = new Car("S1 ", "M1 ", "Black ", 1500d);
		Car c2 = new Car("S2 ", "M2 ", "Yellow ", 800d);
		Car c3 = new Car("S3 ", "M3 ", "Black ", 1200d);
		Car c4 = new Car("S4 ", "M4 ", "White ", 1800d);
		
		Car[] cars = {c1,c2,c3,c4};
		
		// foreach
		for ( Car car: cars) {
			if (car.getPrice() > 1000) {
				System.out.println(car);
			}
		}
		
		for ( Car car: cars) {
			if ("Black".equals(car.getColor())) {
				System.out.println(car);
			}
		}
		
		System.out.println("===============");
		
		// Kiem tra c1 co gia lon hon 1000 hay khong
		Double price = c1.getPrice();
		System.out.println("c2 price: " + (price > 1000));
	}

}
