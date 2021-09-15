package view;

import bean.CarAdv;
import bean.Car;

public class Ex04 {
	//tao 100 mau xe Audi voi cac mau sac khac nhau
	//Audi>>Abba
	
	//khi 1 thuộc tính, ham không phụ thuộc vào đối tượng đang gọi
	//hay sử dụng giá trị
	//non-static
public static void main(String[] args) {
	
	CarAdv.model = "Audi";
	
	CarAdv c1 = new CarAdv("#fff");
	CarAdv c2 = new CarAdv("#f00");
	CarAdv c3 = new CarAdv("#000");
	CarAdv c4 = new CarAdv("#00f");
	//.....
	CarAdv c100 = new CarAdv("fof");
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
	System.out.println(c100);
	
CarAdv.model = "Abba";
	
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
	System.out.println(c100);
}
}
