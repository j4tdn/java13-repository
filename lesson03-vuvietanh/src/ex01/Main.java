package ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		ArrayList<Vehicle> vehicles = null;
		boolean isContinue = true;
		do {
			System.out.println("1. Nhập thông tin và tạo đối tượng xe");
			System.out.println("2. Xuất bản kê tiền khai trước bạ của các loại xe");
			System.out.println("3. Thoát");
			System.out.println("=================================================");
			System.out.print("Nhập thao tác cần thực hiện: ");
			int n = Integer.parseInt(ip.nextLine());
			switch (n) {
			case 1:
				vehicles = input();
				break;
			case 2:
				show(vehicles);
			case 3:
				isContinue = false;
			}
		}while (isContinue);
		
			
		
	}
	//Tạo hàm Arraylist để chứa những đối tượng.
	public static ArrayList<Vehicle> input(){
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		Vehicle v1 = new Vehicle("Nguyễn Thu Loan" , "Futute neo" , 100 ,35000000);
		Vehicle v2 = new Vehicle("Lê Minh Tính" , "Ford Ranger" , 3000 ,250000000);
		Vehicle v3 = new Vehicle("Ng.Minh Triết" , "Landscape" , 1500 ,1000000000);
		vehicles.add(v1);
		vehicles.add(v2);
		vehicles.add(v3);
		return vehicles;
	}
	
	public static void show(ArrayList<Vehicle> vehicles) {
		System.out.println("Tên chủ xe\tLoại xe \tDung tích\tTrị Giá \tTiền thuế");
		System.out.println("===========================================================");
		for(Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
	
	}
}
