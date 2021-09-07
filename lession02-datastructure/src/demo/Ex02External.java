package demo;

import data.Ex04;

public class Ex02External {
	public static void main(String[] args) {
		Ex01TestVM.publicStaticMethod();
		
		//non static , cannot call from other class
		//cannot access private method
		//Ex01TestVM.privateStaticMethod	
		//Initial an instance of class Ex01TestVM
		Ex01TestVM instance = new Ex01TestVM();
		instance.publicMethod();
		
		Ex04.x = 100 ;
	}
	
	public static void publicEx02Method() {
		System.out.println("Method >> Some text ...");
	}
}
