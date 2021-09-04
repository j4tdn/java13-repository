package demo;

public class Ex02Exterminal{
	public static void main(String[] args) {
		
		Ex01TestVM ex01=new Ex01TestVM();
		ex01.publicNonStaticMethod();
		//Ex01TestVM.publicNonStaticMethod();
		
		
		Ex01TestVM.publicStaticMethod();
		//Ex01TestVM.privateStaticMethod();
		
		
		publicEx2Method();
	}
	public static void publicEx2Method() {
		System.out.println("Method");
	}
}
