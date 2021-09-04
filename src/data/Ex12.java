package data;


import bean.Digit;

public class Ex12 {
	public static void main(String[] args) {
		//primitive,object type
		//explain 'm' operator
		int a = 5;//stack
		a = 10;
		int b = 12;
		a=b;//copy value at stack
		
		String s ="welcome";// H1 b:H1(stack) H1(welcome)Heap
		s="say hello";
		String s1 ="bye";
		s=s1;//copy value at stack
		
		Digit d = new Digit(20);//H2
		d.value =22;//H2 set value att heap(except)
		Digit d1 = new Digit(44);//H3
		d=d1;//d1(H3) d1(h3) copy value at stack
		
		//explain final =>cannot re-assign value at STACK
		//cannot use '=' operator again
		//convention:restrict unused,rubbish memory in JVM
		//final Digit d1 = new Digit(33) {
			//d1.value = 55;
		}
 	
}
