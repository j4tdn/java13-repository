package view;

import java.util.Scanner;

public class Ex01 {
	public static void print(Vehicle array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i].printInfomation();
		}
	}
	
	
	public static void main(String[] args) {
		// Câu 1: Nhập thông tin và tạo N đối tượng xe 
		int nCar;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong xe: ");
		nCar = Integer.parseInt(sc.nextLine());
		
		Vehicle vehicles[] = new Vehicle[nCar];
		
		for (int i = 0; i < nCar; i++) {
			System.out.print("Nhap ten chu xe: ");
			String tenChuXe = sc.nextLine();
			System.out.print("Loai xe: ");
			String loaiXe = sc.nextLine();
			System.out.print("Dung tich xe: ");
			int dungTich = Integer.parseInt(sc.nextLine());
			System.out.print("Tri gia xe: ");
			double triGiaXe = Double.parseDouble(sc.nextLine());
			
			vehicles[i] = new Vehicle(tenChuXe, loaiXe, dungTich, triGiaXe);
		}
		
		
		// Câu 2: Xuất bảng kê khai tiền thuế trước bạ của các xe
		
		String heading1 = "Tên chủ xe";
		String heading2 = "Loại xe";
		String heading3 = "Dung tích";
		String heading4 = "Trị giá";
		String heading5 = "Thuế phải nộp";
		String divider = "=========================================================================";
		
		String heading = String.format("%-15s %-10s %10s %12s %15s", 
				heading1, heading2, heading3, heading4, heading5);
		System.out.println(heading);
		System.out.println(divider);
		
		for (int i = 0; i < nCar; i++) {
			String row = String.format("%-15s %-10s %10d %12.2f %15.2f", 
					vehicles[i].getTenChuXe(),
					vehicles[i].getLoaiXe(),
					vehicles[i].getDungTich(),
					vehicles[i].getTriGia(),
					vehicles[i].getThue()
			);
			System.out.println(row);
		}
		
		// Câu 3: Exit
		System.exit(0);
		
	}
}
