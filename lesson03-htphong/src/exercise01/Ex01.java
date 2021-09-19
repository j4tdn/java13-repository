package exercise01;

import java.util.Scanner;
//Bài 1: Sở giao thông cần theo dõi việc đăng ký mua xe của người dân. Dựa vào thông tin trị
//giá xe và dung tích xylanh, sở giao thông tính mức thuế phải đóng trước bạ khi mua xe như
//sau:
//- Dưới 100cc, 1% trị giá xe.
//- Từ 100 đến 200cc, 3% trị giá xe.
//- Trên 200cc, 5% trị giá xe.
//Hãy thiết kế và cài đặt class Vehicle với các attributes và methods phù hợp.
public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int n=0;
		Vehicle[] vehicles=null;
		do {
			System.out.println("1. Nhap thong tin va tao N doi tuong xe.");
			System.out.println("2. Xuat bang ke khai tien thue truoc ba cua cac xe");
			System.out.println("0. Thoat");
			System.out.print("Vui long chon yeu cau (Nhan 0 de thoat) : ");
			n = Integer.parseInt(input.nextLine());
			switch(n) {
			case 1:{
				System.out.print("Nhap so luong xe: ");
				int N = Integer.parseInt(input.nextLine());
				vehicles = new Vehicle[N];
				for(int i=0; i<N; i++) {
					vehicles[i] = new Vehicle();
					System.out.println("Nhap xe thu "+(i+1)+" :");
					vehicles[i].createVehicle();
				}
				break;
			}
			case 2:{
				if(vehicles==null) {
					System.out.println("Chua co thong tin! Can qua so 1!");
					break;
				}
				System.out.printf(" %-20s  %-20s  %-20s  %-22s  %-23s\n","Ten Chu Xe","Loai xe","Dung tich","Gia","Thue");
				System.out.println("===============================================================================================================");
				for(Vehicle vehicle:vehicles) {
					System.out.printf(" %-20s  %-20s  %-20d  %-20.2f  %-18.5f\n ",vehicle.getName(),vehicle.getModel(),vehicle.getCapacity(),vehicle.getPrice(),vehicle.tax());
				}
				break;
			}
			default: break;
			}
		}while(n!=0);
		System.out.println("Finish");
	}
}
