package exercises1;
/*
 * 		Bài 1: Sở giao thông cần theo dõi việc đăng ký mua xe của người dân. 
  		Dựa vào thông tin trị giá xe và dung tích xylanh, sở giao thông tính mức 
  		thuế phải đóng trước bạ khi mua xe như sau: 
		- Dưới 100cc, 1% trị giá xe. 
		- Từ 100 đến 200cc, 3% trị giá xe. 
		- Trên 200cc, 5% trị giá xe. 
		Hãy thiết kế và cài đặt class Vehicle với các attributes và methods phù hợp. 
		Xây dựng class chứa hàm main. Thực hiện các công việc sau đây: 
		1. Nhập thông tin và tạo N đối tượng xe 
		2. Xuất bảng kê khai tiền thuế trước bạ của các xe. 
		3. Thoát. 
*
*/
public class Ex01 {
	public static void main(String[] args) {
		
		// Nhập thông tin và tạo các đối tượng xe 
		Vehicle v1 = new Vehicle("Phạm Thành Nguyên", "Wave", 150, 15000000);
		Vehicle v2 = new Vehicle("Trần Công Việt", "Cup", 100, 10000000);
		Vehicle v3 = new Vehicle("Hồ Hoàng Thiện", "Honda", 300, 30000000);
		
		// Xuất bảng kê khai tiền thuế trước bạ của các xe. 
		System.out.printf("%-20s%-20s%-20s%-20s%s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		System.out.println("==================================================="
				+ "=================================================");
		ouputVehicle(v1);
		ouputVehicle(v2);
		ouputVehicle(v3);
	}
	
	public static void ouputVehicle(Vehicle v) {
		System.out.printf("%-20s%-20s%-20d%-20.2f%.2f\n", v.getOwnerName(), v.getType(), v.getCapacity(), v.getValue(), v.getTax());
	}
}
