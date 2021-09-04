package demo;

import data.Ex04;

//class : camel case : Student , StudentGroup
public class Ex02External {
	public static void main(String[] args) {
		publicEx02Method();
		Ex01TestVM.publicStaticMethod();
		//Ex01TestVM.praveteSaticMethod();
		//cannot access private method from outer class
		//Inital an instance of class Ex01TestVM
		Ex01TestVM instance = new Ex01TestVM();
		instance.publiMethod();
	}
		//tên hàm: theo camel case >> get , getStuden ,getStudenName
		//static : OOP >>Class' s scope >> Class.staticMethod
		//none static : Object's scope >>Object.nonstaticMethod
	public static void publicEx02Method() {
		System.out.println("Method >> some text....");
	}
}
