package view;

import bean.CarAdv;

public class Ex04 {
	public static void main(String[] args) {
		// Tạo 100 mẫu xe Audi với các màu sắc khác nhau
		// Audi >> Abba
		
		// Khi 1 thuộc tính, hàm mà không phụ thuộc vào đối tượng đang g�?i
		// >>>> Sử dụng static
		
		// Khi 1 thuộc tính, hàm mà phụ thuộc vào đối tượng đang g�?i
		// Hay là giá trị phụ thuộc vào đối tượng đang g�?i
		// >> Sử dụng non static
		CarAdv.model = "Audi";
		CarAdv c1 = new CarAdv("#fff");
		CarAdv c2 = new CarAdv("#f00");
		
		CarAdv.model = "Abba";
		CarAdv c3 = new CarAdv("#000");
		CarAdv c4 = new CarAdv("#00f");
		// ...
		CarAdv c100 = new CarAdv("#ececec");	
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c100);
	}
}
