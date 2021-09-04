package demo;

import data.Ex04;

public class Ex02External {
	public static void main(String[] args) {
		Ex01TestVM.publicStaticMethod();
		Ex01TestVM instance = new Ex01TestVM();
		instance.publicMethod();
		publicEx02Method();
		Ex04.x = 100;
	}
	
	public static void publicEx02Method() {
		System.out.println("Method >> Some text ...");
	}
}
