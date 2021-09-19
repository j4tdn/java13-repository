package view;

import java.util.Scanner;

import bean.Vehicle;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("1. Nhập thông tin và tạo N đối tượng xe.");
		System.out.print("Nhập N: ");
		Scanner ip = new Scanner(System.in);
		
		int n = Integer.parseInt(ip.nextLine());
		Vehicle[] vehicle = new Vehicle[n];
		
		for(int i = 0; i < n ; i++) {
			vehicle[i] = new Vehicle();
			System.out.print("\nNhập chủ sở hữu: ");
			vehicle[i].setOwner(ip.nextLine());
			System.out.print("Nhập model: ");
			vehicle[i].setModel(ip.nextLine());
			System.out.print("Nhập dung tích: ");
			vehicle[i].setCapacity(Integer.parseInt(ip.nextLine()));
			System.out.print("Nhập trị giá xe: ");
			vehicle[i].setPrice(Double.parseDouble(ip.nextLine()));
		}
		
		System.out.println("\n2. Xuất bảng kê khai tiền thuế trước bạ của các xe.\n");
		System.out.printf("%-25s%-20s%10s%20s%20s", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		System.out.println("\n=====================================================================================================");
		
		for(int i = 0; i < n ; i++) {
			System.out.println(vehicle[i]);
		}
		
		while(true) {
			System.out.print("\n3. Nhấn'T' để thoát. ");
			if(ip.nextLine().charAt(0) == 'T') {
				System.exit(0);
			}
		}
	}
}
