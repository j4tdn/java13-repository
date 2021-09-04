package demo;

import data.Ex04;

//class: Camel case: Student, StudentGroup
public class Ex02External {
	public static void main (String[] args) {
		Ex01TestVM.publicStaticMethod();
		
		//non static >> cannot call method by class name
		// Ex01TestVM.publicMethod();
		
		//Initial an instance of class Ex01TestVM
		Ex01TestVM instance = new Ex01TestVM();
		instance.publicMethod();
		
		// Cannot access private method from outer class
		// Ex01TestVM.privateStaticMethod(); 
		
		// publicEx02Method();
		
		Ex04.x = 100;

	}
	
	// Camel case: Camel case: get, getStudent, getStudentName
	// static: 
	private static void publicEx02Method() {
		System.out.println("Method >> Some text ...");		
	}
}
