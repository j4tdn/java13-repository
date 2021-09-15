package view;

import bean.Car;
import bean.CarAdv;

public class Ex04 {
	public static void main(String[] args) {
		// Tạo 100 mẫu xe Audi với màu sắc khác nhau
		// Audi > Abba
		
		// Khi 1 thuộc tính hoặc hàm không phụ thuộc vào đối tượng đang gọi
		// >> sử dụng static
		
		// Khi 1 thuộc tính hoặc hàm phụ thuộc vào đối tượng đang gọi
		// Hay là giá trị phụ thuộc vào đối tượng đang gọi
		// >> sử dụng non-static
		
		CarAdv.model = "Audi";
		
		CarAdv c1 = new CarAdv("#fff");
		CarAdv c2 = new CarAdv("#f00");
		CarAdv c3 = new CarAdv("#0f0");
		CarAdv c4 = new CarAdv("#00f");
		// ....
		CarAdv c100 = new CarAdv("#000");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c100);
	}
}
