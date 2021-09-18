package view;

import bean.Car;

/**
 * 
 *printout all cars have price > 1000
 *
 */
public class Ex08 {
	public static void main(String[] args) {
		Car c1 = new Car("S1","M1","Black",1600d);		
		Car c2 = new Car("S2","M1",null,800d);
		Car c3 = new Car("S3","M2","Blue",1500d);
		Car c4 = new Car("S4","M2","Black",1700d);
		
		
		Car[] cars = {c1,c2,c3,c4};
		for (Car car:cars) {
			//if(car.getPrice()>1000) {
			//	System.out.println(car);
			if("Black".equals(car.getColor())) {
				System.out.println(car);
			}
		}
		//Kiểm tra c1 có giá trị lớn hơn 1000 hay ko
		//Double price = c1.getPrice();
		
		//System.out.println("c1 price : "+ (price > 1000));
		
		
	}
  
}
