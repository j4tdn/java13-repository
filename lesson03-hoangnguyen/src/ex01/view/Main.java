package ex01.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ex01.bean.Vehicle;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Vehicle> vehicles = null;
		boolean isContinue = true;
		
		do {
			System.out.println("1. Nhập thông tin và tạo N đối tượng xe");
			System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe");
			System.out.println("3. Thoát");
			System.out.println("=====================================================");
			System.out.print("Nhập thao thác cần thực hiện: ");
			int n = Integer.parseInt(sc.nextLine());
			
			switch(n) {
				case 1:
					 vehicles = input();
					 break;
				case 2:
					show(vehicles);
					break;
				case 3:
					isContinue = false;
					break;
				default:
					System.out.println("Vui lòng nhập từ 1 đến 3");
					break;
			}
		} while(isContinue);
	}
	
	public static ArrayList<Vehicle> input() {
		
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		Vehicle v1 = new Vehicle("Nguyễn Thu Loan", "Future neo", 100, 35000000);
		Vehicle v2 = new Vehicle("Lê Minh Tính", "Ford Ranger", 3000, 250000000);
		Vehicle v3 = new Vehicle("Nguyễn Minh Triết", "Landscape", 1500, 1000000000);
		vehicles.add(v1);
		vehicles.add(v2);
		vehicles.add(v3);
		
		return vehicles;
	}
	
	public static void show(ArrayList<Vehicle> vehicles) {
		System.out.println("Tên chủ xe \tLoại xe \tDung tích \tTrị Giá \tThuế phải nộp");
		System.out.println("================================================================================");
		
		for(Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
	}
}
