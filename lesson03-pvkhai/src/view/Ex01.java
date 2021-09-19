package view;

import java.util.ArrayList;
import java.util.Scanner;

import bean.Vehicle;

public class Ex01 {
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		do {
			System.out.println("Chọn công việc cần thực hiện!");
			System.out.println("1. Nhập thông tin và tạo đối tượng xe");
			System.out.println("2. Xuất bảng kê khai thuế trước bạ");
			System.out.println("3. Thoát");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				Vehicle v = thongTinXe();
				vehicles.add(v);
				break;
			case 2:
				System.out.println("Tên chủ xe   Loại xe   Dung tích   Trị giá   Thuế trước bạ  ");
				System.out.println("========================================================");
				for(Vehicle vehicle : vehicles) {
					System.out.println(vehicle);
				}
				break;
			case 3:
				System.out.println("Tạm biệt!!!");
				flag = false;
				break;
			default:
				System.out.println("Nhập n 1-3!!!");
				break;
			}
		}while(flag);
	}
	public static Vehicle  thongTinXe() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên chủ xe: ");
		String owner = sc.nextLine();
		System.out.println("Nhập loại xe:");
		String model = sc.nextLine();
		System.out.println("Nhập dung tích:");
		float capacity = sc.nextFloat();
		System.out.println("Nhập  giá trị:");
		double value = sc.nextDouble();
		 
		Vehicle v = new Vehicle(owner,model,capacity,value);
		return v;
	}
	
	
}
