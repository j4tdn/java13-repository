package view;
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
import java.util.Scanner;

import bean.Vehicle;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int No, N = 0;
		Vehicle [] v = null;
		
		do {
			
			System.out.println("1. nhap thong tin va tao N doi tuong xe");
			System.out.println("2. Xuat ban ke khai thue truoc ba");
			System.out.println("3. Thoat ");
			System.out.println("Moi chon chuc nang");
			No = Integer.parseInt(input.nextLine());
			switch(No) {
				case 1: {
					
					System.out.print("Nhap so luong xe");
					N =  Integer.parseInt(input.nextLine());
//					System.out.println(N);
					v = new Vehicle[N];
					
					for (int i = 0; i< N; i++) {
						v[i] = new Vehicle();
						System.out.println("nhap thong tin xe thu "+ (i+1) + ": ");
						System.out.print("Ho va ten: "); 
						v[i].setName(input.nextLine()) ;
						System.out.print("Loai xe: ");
						v[i].setModel(input.nextLine());
						System.out.print("Dung tich: ");
						v[i].setCapacity(Integer.parseInt(input.nextLine()));
						System.out.print("Gia: ");
						v[i].setPrice(Float.parseFloat(input.nextLine()));
					}
					break;
				}
				case 2: {
					System.out.println(String.format("%-30s %-20s %-10s %-20s %-10s","Name","Model","Capacity","Price","Tax"));
					System.out.println(String.format("%-90s","==========================================================================================="));
					for(int i =0; i < N; i++) {
						System.out.println(v[i].toString());
					}
					System.out.println(String.format("%-90s","==========================================================================================="));
					break;
				}
				default : break;
			}
			
		}while(No != 3);
//		 System.out.println("ket thuc vong while");
		return;
	}	
}
