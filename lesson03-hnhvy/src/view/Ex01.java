package view;

import java.util.Scanner;

import bean.Vehicle;
/**
 * 19/09/21
 * Sở giao thông cần theo dõi việc đăng ký mua xe của người dân. Dựa vào thông tin trị
giá xe và dung tích xylanh, sở giao thông tính mức thuế phải đóng trước bạ khi mua xe như
sau:
- Dưới 100cc, 1% trị giá xe.
- Từ 100 đến 200cc, 3% trị giá xe.
- Trên 200cc, 5% trị giá xe.
Hãy thiết kế và cài đặt class Vehicle với các attributes và methods phù hợp.
Xây dựng class chứa hàm main. Thực hiện các công việc sau đây:
1. Nhập thông tin và tạo N đối tượng xe
2. Xuất bảng kê khai tiền thuế trước bạ của các xe.
3. Thoát.
 * @author Vy Ho
 *
 */
public class Ex01 {
	
	static Scanner sc = new Scanner(System.in);
	
    //input: 
      static void input(Vehicle vehicle){
    	  sc.nextLine();
            System.out.print("Nhập tên chủ xe: ");
            vehicle.setOwner(sc.nextLine());
            System.out.print("Loại xe: ");
            vehicle.setType(sc.nextLine());
            System.out.print("Nhập dung tích xe: ");
            vehicle.setCapacity(sc.nextInt());
            System.out.print("Nhập trị giá xe: ");
            vehicle.setPrice(sc.nextDouble());
            
        }
      
    public static void main(String[] args) {
        Vehicle v[]= null;
        int a,n=0;
        boolean flag = true;
  
        do{
            System.out.println("Chọn công việc bạn muốn!!!");
            System.out.println("1.Tạo các đối tượng xe và nhập thông tin cho chúng");
            System.out.println("2. Xuất bảng kê khai thuế trước bạ");
			System.out.println("3. Thoát");
            a =sc.nextInt();
            switch (a){
                case 1:
                    System.out.print("Nhập số lượng xe bạn muốn khai báo thuế: ");
                    n=sc.nextInt();
                    v = new Vehicle[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Xe thứ " + (i+1));
                        v[i] = new Vehicle();
                        input(v[i]);
                    }
                    break;
                case 2:
                    System.out.printf(" %-20s  %-20s  %-20s  %-20s  %-20s\n","Chủ xe","Loại xe","Dung tích","Trị giá","Thuế");
                    System.out.println("==========================================================================================================");
                    for (int i = 0; i<n; i++) {
                        v[i].printTax();
                    }
                    break;
                case 3:
                    System.out.println("Thoát");
                    flag=false;
                    break;
            }
        }while (flag);
    }
	}