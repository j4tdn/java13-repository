package view;

import bean.CarAdv;

public class Ex04 {
	public static void main(String[] args) {
		// Tao 100 mau xe Audi voi cac mau sac khac nhau
		
		// khi 1 thuoc tinh, ham ma khong phu thuoc vao doi tuong dang goi
		
		// Audi >> Abba
		CarAdv.model = "Audi";
		
		CarAdv c1 = new CarAdv("#fff");
		CarAdv c2 = new CarAdv("#f00");
		
		CarAdv.model = "Abba";
		CarAdv c3 = new CarAdv("#f01");
		CarAdv c4 = new CarAdv("#f02");
		//------------------------------------
		CarAdv c100 = new CarAdv("#000");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c100);
	}
}
