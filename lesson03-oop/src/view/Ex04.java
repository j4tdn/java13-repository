package view;

import bean.Car;
import bean.CarAdv;

public class Ex04 {
	
	public static void main(String[] args) {
		// Tạo 100 mẫu xe Audi với các màu sắc khác nhau
		// Audi >> Abba
		
		// Khi 1 thuộc tính, hàm mà không phụ thuộc vào đối tượng đang gọi
		// >> Sử dụng static
		
		// Khi 1 thuộc tính, hàm mà phụ thuộc vào đối tượng đang gọi
		// Hay là giá trị phụ thuộc vào đối tượng đang gọi
		// >> Sử dụng non-static
		
		CarAdv.model = "Audi";
		CarAdv c1 = new CarAdv("#fff");
		CarAdv c2 = new CarAdv("#f00");
		CarAdv c3 = new CarAdv("#f4g");
		CarAdv c4 = new CarAdv("#f44");
		// ....
		CarAdv c100 = new CarAdv("#ececec");
	}
}
