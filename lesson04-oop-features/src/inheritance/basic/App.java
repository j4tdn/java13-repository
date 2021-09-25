package inheritance.basic;

public class App {
	
	public static void main(String[] args) {
		Parent p1 = new Parent();
		System.out.println(p1.digit); //10
		System.out.println(p1.text); //parent
		p1.log(); //parent >> logging.. 
		
		Child c1 = new Child();
		System.out.println(c1.digit); //20
		System.out.println(c1.text);  //child
		c1.log(); //child >> logging..
		
		
		Parent p2 = new Child();
		//attributes no override 
		System.out.println(p2.digit); //10
		System.out.println(p2.text);  //parent
		//method override
		p2.log(); //child >> logging..
	}
}
