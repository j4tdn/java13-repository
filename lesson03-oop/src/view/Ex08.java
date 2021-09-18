package view;

import bean.Car;

public class Ex08 {
	public static void main(String[] args) {
		Car c1 = new Car("S1", "M1", "Black", 1500d);
		Car c2 = new Car("S2", "M1", "Yellow", 800d);
		Car c3 = new Car("S3", "M2", "Black", 1200d);
		Car c4 = new Car("S4", "M2", "White", 1800d);
		
		Car[] cars = {c1, c2, c3, c4};
		
		for (Car car : cars) {
			if ("Black".equals(car.getColor())) {
				System.out.println(car);
			}
		}
		
		Double price = c1.getPrice();
		System.out.println("c1 price " + (price > 1000));
	}
	
}
