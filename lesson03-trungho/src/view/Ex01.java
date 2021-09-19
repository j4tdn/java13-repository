package view;

import java.util.Scanner;

/**
 * Bài 1: Viết chương trình nhập vào thông tin các phương tiện/xe (Chủ xe, Loại xe, Dung tích xylanh, trị giá xe) và lưu trữ chúng
 * Sau đó tính mức thuế phải nộp cho từng xe (dựa vào dung tích xylanh và giá trị xe) và in ra tất cả các thông tin liên quan cho tất cả các xe đã nhập vào
 */
public class Ex01 {
	public static void main(String[] args) {
		printVehicleInfo(getVehicleInfo());
	}
	
	/**
	 * Hàm này dùng để tính mức thuế (phần trăm) phải đóng dựa trên dung tích xylanh
	 */
	public static Double taxRateCalculation(Double cylinderCapacity) {
		if(cylinderCapacity < 100) {
			return 0.01;
		} else if((cylinderCapacity >= 100) && (cylinderCapacity <= 200)) {
			return 0.03;
		}
		return 0.05;
	}
	
	/**
	 * Hàm này dùng để nhập thông tin các xe từ bàn phím và lưu trữ chúng
	 * Hàm này cũng tính luôn thuế phải nộp cho từng xe và lưu trữ chúng
	 */
	public static Object[][] getVehicleInfo () {
		Double cylinderCapacity;
		Double price;
		Double tax = null;
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Please enter the number of vehicles you want to store: ");
		Integer number = Integer.parseInt(ip.nextLine());
		
		Object[][] arrayOfVehicle = new Object[number][5];
		
		for (int i = 0; i < number; i++) {
			System.out.println("Enter the owner of the vehicle: ");
			arrayOfVehicle[i][0] = ip.nextLine();
			
			System.out.println("Enter the type of the vehicle: ");
			arrayOfVehicle[i][1] = ip.nextLine();
			
			System.out.println("Enter the cylinder capacity of the vehicle: ");
			cylinderCapacity = Double.parseDouble(ip.nextLine());
			arrayOfVehicle[i][2] = cylinderCapacity;
			
			System.out.println("Enter the price of the vehicle: ");
			price = Double.parseDouble(ip.nextLine());
			arrayOfVehicle[i][3] = price;
			
			tax = taxRateCalculation(cylinderCapacity)*price;
			arrayOfVehicle[i][4] = tax;
		}
		return arrayOfVehicle;
	}
	
	/**
	 * Hàm này dùng để in ra tất cả các thông tin liên quan cho tất cả các xe đã nhập vào theo định dạng nhất định
	 */
	public static void printVehicleInfo(Object[][] arrayOfVehicle) {
		System.out.println("---------------------------------------------------------------------------------------------");
		String header = String.format("%-20s%-20s%-20s%-20s%s", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		System.out.println(header);
		System.out.println("---------------------------------------------------------------------------------------------");
		
		for(int i = 0; i < arrayOfVehicle.length; i++) {
			for (int j = 0; j < arrayOfVehicle[i].length; j++) {
				String value = String.format("%-20s", arrayOfVehicle[i][j]);
				System.out.print(value);
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------------------------------------------------");
	}
}
