package demo;

public class Ex01TestVM {
	public static void main(String[] args) {
		System.out.println("Welcome to JAVA13 class");
		System.out.println("How are you");
		System.out.println("Enjoy your time");
		System.out.println("=========");
		publicStaticMethod();
		privateStaticMethod();
	}
 

public static void publicStaticMethod()
{
	System.out.println("Method >> publicStaticMethod");
}

private static void privateStaticMethod() {
	System.out.println("Method >> privateStaticMethod");
}
//non static:
public void publicMethod() {
	System.out.println("Method >> publicMethod");
}
}
