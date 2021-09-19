package homework;
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

public class Main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Vehicle v[] = null;
		
		while(true) {
			
			System.out.println("1. Nhập thông tin");
			System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe");
			System.out.println("3. Thoát");
			System.out.println("Chọn 1, 2 hoặc 3");
			int nbr = ip.nextInt();
			int n = 0;
			
			switch(nbr) {
			case(1):
				System.out.println("Nhập số lượng xe: ");
				n = ip.nextInt();
				v = new Vehicle[n];
				for (int i = 0; i < n ; i++ ) {
					System.out.println("Xe thu: " + (i+1));
					v[i] = new Vehicle();
					inputVehicle(v[i]);
				}
				break;
			case(2):
				System.out.printf("%10s %10s %10s %10s %12s \n","Tên chủ xe","Loại xe","Dung tích","Trị giá","Thuế phải nộp");
				System.out.println("======================================================================");
				for (int i = 0; i < n; i++) {
					 v[i].printfV();
				   }
				break;
			case(3):
				System.out.println("bye");
				break;
			}
		}
	}
	
	public static void inputVehicle(Vehicle vehicle) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập tên chủ xe: ");
		Vehicle name = new Vehicle();
		name.setNamecustumers(ip.nextLine());
		System.out.println("Nhập tên loại xe: ");
		Vehicle model = new Vehicle();
		model.setType(ip.nextLine());
		System.out.println("Nhập dung tích của xe");
		Vehicle capacity = new Vehicle();
		capacity.setCapacity(ip.nextInt());
		System.out.println("Nhập trị giá của xe ");
		Vehicle price = new Vehicle();
		price.setPrice(ip.nextDouble());
	}
}