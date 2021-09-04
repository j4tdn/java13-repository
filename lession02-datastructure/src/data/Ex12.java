package data;

import bean.Digit;

public class Ex12 {
	public static void main(String[] args) {
		//primitive, object type		
		//explain '=' operator
		int a = 5;//stack
		a = 10;
		int b = 12;
		a = b;//copy value at stack
		
		String s = "welcome";// H1 b:H1(stack) H1(welcome)HEAP
		s = "say hello";//create a new heap
		String s1 = "bye";
		s = s1;//copy at stack
		
		Digit d = new Digit(20);//H2
		d.value = 22;//H2 set value at heap
		Digit d1 = new Digit(44);//H3
		d = d1;//d(H3) d1(H3) copy at stack;
		
		//explain final => cannot re-assign value at stack
		//cannot use '=' operator again
		//convention : restrict unused, rubbish memory in JVM
		final int z1 = 10;
		//z1 = 100;//stack 
		
		final Integer i1 = 10;
		Integer i2 = 20;
		//i1 = 100;//stack
		i2 = i1;
		
		final Digit d2 = new Digit(99);
		final Digit d3 = new Digit(101);
		//d2 = d3;//stack
		//but could assign value at heap
		d2.value = d3.value;
		
	}
}
