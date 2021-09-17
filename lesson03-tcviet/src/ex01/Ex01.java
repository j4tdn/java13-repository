package ex01;
/**
 * 	Bài 1: Sở giao thông cần theo dõi việc đăng ký mua xe của người dân. Dựa vào thông tin trị
		giá xe và dung tích xylanh, sở giao thông tính mức thuế phải đóng trước bạ khi mua xe như
		sau:
	Hãy thiết kế và cài đặt class Vehicle với các attributes và methods phù hợp.
	Xây dựng class chứa hàm main. Thực hiện các công việc sau đây:
		1. Nhập thông tin và tạo N đối tượng xe
		2. Xuất bảng kê khai tiền thuế trước bạ của các xe.
		3. Thoát.
 *
 */
public class Ex01 {
	public static void main(String[] args) {
		//1. Nhập thông tin và tạo N đối tượng xe
		Vehicle v1 = new Vehicle("Trần Công Việt", "Cup50", 50, 16500000d);
		Vehicle v2 = new Vehicle("Phạm Thành Nguyên", "Wave", 120 , 23500000d);
		Vehicle v3 = new Vehicle("Phan Ngọc Quyền", "Z1000", 1000, 459000000d);
		
		
		//2. Xuất bảng kê khai tiền thuế trước bạ của các xe
		System.out.printf("%-25s%-25s%-25s%-25s%s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		System.out.println("================================================================================================"
				+ "===================");
		writeVehicle(v1);
		writeVehicle(v2);
		writeVehicle(v3);
	}
	public static void writeVehicle(Vehicle v) {
		System.out.printf("%-25s%-25s%-25d%-25.2f%.2f\n", v.getCarOwner(), v.getType(), v.getCapacity(), v.getValue(), v.getTax());
	}
}

