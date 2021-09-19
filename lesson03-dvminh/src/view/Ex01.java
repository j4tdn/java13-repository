/*
 * Bài 1: Sở giao thông cần theo dõi việc đăng ký mua xe của người dân. Dựa vào thông tin trị giá xe và dung tích xylanh, sở giao thông tính mức thuế phải đóng trước bạ khi mua xe như sau: 
- Dưới 100cc, 1% trị giá xe. 
- Từ 100 đến 200cc, 3% trị giá xe. 
- Trên 200cc, 5% trị giá xe. 
Hãy thiết kế và cài đặt class Vehicle với các attributes và methods phù hợp. Xây dựng class chứa hàm main. Thực hiện các công việc sau đây: 
1. Nhập thông tin và tạo N đối tượng xe 
2. Xuất bảng kê khai tiền thuế trước bạ của các xe. 
3. Thoát. 
 */
package view;

import java.util.Scanner;

import bean.Vehicle;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a, n = 0;
		Vehicle[] vhc = null;
		Boolean exit = true;
		
		do {
			System.out.println("1. Nhập thông tin và tạo N đối tượng xe");
			System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe.");
			System.out.println("3. Thoát.");			
			a = Integer.parseInt(ip.nextLine());
			switch (a) {
			case 1:
				System.out.print("Nhập số lượng xe: ");
				n = Integer.parseInt(ip.nextLine());
				vhc = new Vehicle[n];
				
				for (int i = 0; i < n; i++) {
				    vhc[i] = new Vehicle();	
					System.out.println("Nhập thông tin");
					System.out.println("Tên chủ xe: ");
					vhc[i].setName(ip.nextLine());
					System.out.println("Loại xe: ");
					vhc[i].setModel(ip.nextLine());
					System.out.println("Dung tich: ");
					vhc[i].setCapacity(Double.parseDouble(ip.nextLine()));
					System.out.println("trị giá: ");
					vhc[i].setPrice(Double.parseDouble(ip.nextLine()));															
				} break;
				
			case 2:
				System.out.println("Tên chủ xe   Loại xe   Dung tích   Trị giá   Thuế trước bạ  ");
				System.out.println("============================================================");
				for (Vehicle v : vhc) {
					System.out.println(v);
				} break;	
			case 3:
				exit = false;
				break;
			}
		}while(exit);
		
		
	}
	
}