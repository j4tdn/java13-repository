package demo;
import data.Ex04;
public class Ex02External {
	public static void main(String[] args) {
		publicEx02Method();
		Ex01TestVM.publicStaticMethod();
		//Ex01TestVM.privateStaticMethod(); 
		//cannot access private method from outer class
		
		// non static >> cannot call by class name
		Ex01TestVM instance = new Ex01TestVM();
		instance.publicMethod();
		
		// cannot access private method from outer class
		Ex04.x = 100;
	}
	
	// Method: Camel case >> get, getStudent, getStudentName
	// static : OOP >> class's scope >> class.staticMethod
	
	// non-static: Object's scope >> object.nonstaticmethod
	public static void publicEx02Method()
	{
		System.out.println("Method >> Some text.....");
	}
}
