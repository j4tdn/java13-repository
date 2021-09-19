package ex01;

import java.util.Scanner;


/*Hãy thiết kế và cài đặt class Vehicle với các attributes và methods phù hợp.
Xây dựng class chứa hàm main. Thực hiện các công việc sau đây:
1. Nhập thông tin và tạo N đối tượng xe
2. Xuất bảng kê khai tiền thuế trước bạ của các xe.
3. Thoát.*/

public class view {

	public static void main(String[] args) {
		int n = 0;
		boolean check = true;
		Scanner ip = new Scanner(System.in);
		Vehicle xe = new Vehicle();
		Vehicle v[] = null;

		do {
			System.out.println("Chọn công việc cần thực hiện: ");
			System.out.println("1. Tạo các đối tượng xe và nhập thông tin \n"
					+ "2. Xuất bảng kê khai tiền thuế trước bạ của các xe.\n" + "3. Thoát");
			int a = ip.nextInt();

			switch (a) {
			case 1:
				System.out.println("Nhập số đối tượng xe cần tạo: ");
				n = ip.nextInt();
				v = new Vehicle[n];
				for (int i = 0; i < n; i++) {
					System.out.println("Nhập thông tin của xe thứ " + (i + 1) + " :");
					v[i] = new Vehicle();
					nhapXe(v[i]);
				}

				break;
			case 2:
				System.out.println("Thông tin xe bạn đã nhập: ");
				System.out.printf(" %-25s%-25s%-25s%-25s%s\n", "Tên chủ xe", "Tên xe ", "Dung tích ", "Trị giá",
						"Thuế phải nộp ");
				System.out.println(
						"===================================================================================================================");
				for (int i = 0; i < n; i++) {
					
					v[i].inThue();
					
				}
			case 3:
				check = false;
				break;
			}
		} while (check);

	}

	public static void nhapXe(Vehicle xe) {
		Scanner ip = new Scanner(System.in);
		System.out.print("* Nhập tên chủ xe: ");
		xe.setName(ip.nextLine());
		System.out.print("* Nhập tên xe: ");
		xe.setCarName(ip.nextLine());
		System.out.print("* Nhập dung tích xe: ");
		xe.setCapacity(ip.nextInt());
		System.out.print("* Nhập trị giá xe: ");
		xe.setPrice(ip.nextLong());
		ip.nextLine();
	}
}
