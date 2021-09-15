package view;

import bean.CarAdv;

public class Ex04 {
	public static void main(String[] args) {
		//tao 100 mau audi vs mau sac khac nhau
		
		CarAdv.model="Audi";
		CarAdv c1 = new CarAdv("#fff");
		CarAdv c2 = new CarAdv("#f00");
		CarAdv c3 = new CarAdv("#000");
		CarAdv c4 = new CarAdv("#00f");
		// ...
		CarAdv c100 = new CarAdv("#ececec");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		//....
		System.out.println(c100);
	}
}
