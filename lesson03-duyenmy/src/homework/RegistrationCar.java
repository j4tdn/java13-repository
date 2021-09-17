package homework;

import java.util.Scanner;
import homework.Vehicle;
public class RegistrationCar {
	
	static Scanner sc = new Scanner(System.in);
	
    //tạo phương thức nhập thông tin cho xe
      static void nhapXe(Vehicle xe){
    	  sc.nextLine();
            System.out.print("Nhập tên chủ xe: ");
            xe.setChuXe(sc.nextLine());
            System.out.print("Loại xe: ");
            xe.setLoaiXe(sc.nextLine());
            System.out.print("Nhập dung tích xe: ");
            xe.setDungTich(sc.nextInt());
            System.out.print("Nhập trị giá xe: ");
            xe.setTriGia(sc.nextDouble());
            
        }
        //tạo phương thức main để chạy các phương thức khác ở class Vehicle
    public static void main(String[] args) {
        Vehicle u[]= null;//mang chua xe
        int a,n=0;
        boolean t = true;
        //sử dụng switch case để tạo menu cho chương trình
        do{
            System.out.println("Chọn công việc bạn muốn!!!");
            System.out.println("1.Tạo các đối tượng xe và nhập thông tin cho chúng \n"+
                    "2.Xuất bảng kê khai tiền thuế trước bạ của các xe.\n"+
                    "3.Thoát");
            a =sc.nextInt();
            switch (a){
                case 1:
                    System.out.print("Nhập số lượng xe bạn muốn khai báo thuế: ");
                    n=sc.nextInt();
                    //khai báo mảng v[] để chứa số lượng xe
                    u= new Vehicle[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Xe thứ " + (i+1));
                        u[i] = new Vehicle();
                        nhapXe(u[i]);
                    }
                    break;
                case 2:
                    System.out.printf(" %-20s  %-20s  %-20s  %-22s  %-23s\n","Chủ xe","Loại xe","Dung tích","Trị giá","Thuế");
                    System.out.println("==========================================================================================================");
                    for (int i = 0; i<n; i++) {
                        u[i].inThue();
                    }
                    break;
                case 3:
                    System.out.println("bye");
                    t=false;
                    break;
            }
        }while (t);
    }
}
