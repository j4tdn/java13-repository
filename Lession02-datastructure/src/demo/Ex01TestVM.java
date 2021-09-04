package demo;

public class Ex01TestVM {
		//method = function
		//Run App =Ctrl F11
	public static void main(String[] arges) {
		System.out.println("Welcome to Java13 class");
		System.out.println("How are you");
		System.out.println("Enjoy your time");
		System.out.println("==========");
		publicStaticMethod();
		privateStaticMethod();
		main();
      }
	
	 	//Access midifier : [public private] protected _
		//void: return_type : kiểu trả về
	public static void publicStaticMethod() {
		System.out.println("publicStaticMethod");
	}
	public void publiMethod() {
		System.out.println("publicMethod");
	}
	private static void privateStaticMethod() {
		System.out.println("privateStaticMethod");
	}
	public static void main () {
		System.out.println("2nd main");
	}
	
}