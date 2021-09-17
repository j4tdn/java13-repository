package view;

import bean.CarAdv;

public class Ex04 {

	public static void main(String[] args) {
		CarAdv.model = "Audi"; 
		
		CarAdv c1 = new CarAdv("#fff");
		c1.model = "Audi";
		
		CarAdv c2 = new CarAdv("#f00");
		c2.model = "Audi"; 
		
		
		CarAdv c3 = new CarAdv("#000");
		c3.model = "Abba";
		
		CarAdv c4 = new CarAdv("#00f");
		// .......
		CarAdv c100 = new CarAdv("#ececec");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c100);
	}

}
