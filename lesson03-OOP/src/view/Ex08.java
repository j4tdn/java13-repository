package view;

import been.Car;

/**
 * 
 * in ra tất cả xe có giá hơn 1000
 *
 */
public class Ex08 {
	public static void main(String[] args) {
		Car c1 = new Car("s1", "M1", "Black", 1500d);
		Car c2 = new Car("s2", "M1", null, 800d);
		Car c3 = new Car("s3", "M2", "Black", 1200d);
		Car c4 = new Car("s4", "M2", "White", 1800d);
		
		Car[] cars = {c1,c2,c3,c4};
		//foreach
		//for (tên class + ten bien : ten mảng)
		for (Car car : cars) {
			if (car.getPrice() > 1000) {
				System.out.println(car);
			}
		}
		for (Car car : cars) {
			if ("black".equals(car.getColor())) {
				System.out.println(car);
		
			}
		}
		//for(int i = 0;i < cars.length;i++)
			//if(cars[i].getPrice() > 1000) {
				//System.out.println(cars);
			//}
	}
}
