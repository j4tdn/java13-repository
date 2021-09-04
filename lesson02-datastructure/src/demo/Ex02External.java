package demo;

import data.Ex04;

// convention
// class: Camel case: Student, StudentGroup
public class Ex02External {
	public static void main(String[] args) {
		Ex01TestVM.publicStaticMethod();
		// non static >> cannot call by class name
		// Ex01TestVM.publicMethod();
		
		// Initial an instance of class Ex01TestVM
		Ex01TestVM instance = new Ex01TestVM();
		instance.publicMethod();
		
		// cannot access private method from outer class
		// Ex01TestVM.privateStaticMethod(); 
		
		// publicEx02Method();
		
		Ex04.x = 100;
	}
	
	// Method: Camel case >> get, getStudent, getStudentName
	// static: OOP >> Class's scope >> Class.staticMethod
	
	// non-static: Object's scope >> object.nonstaticmethod
	public static void publicEx02Method() {
		System.out.println("Method >> Some text ...");
	}
}
