package view;

import bean.Car;

public class Ex03 {
   public static void main(String[] args) {
	// 100%5 >> operator == always compare values at stack
	int a1 = 5;
	int a2 = 10;
	System.out.println("a1==a2  >> " +(a1==a2));
	
	System.out.println("=========");
	
	Car c1 = new Car();
	Car c2 = new Car();
	System.out.println("c1==c2  >> " +(c1==c2));// return False
	//eq 
	System.out.println("c1 eq c2  >> " +(c1.equals(c2)));//
	hash("c1 hash ", c1);
	hash("c1 hash ", c2);
	
	System.out.println("=========");
	
	Car c3 = new Car("S123","Mazda","Blue");
	Car c4 = new Car("S342","Mec","Blue");
	System.out.println("c1==c2  >> " +(c3==c4));
	hash("c1 hash ", c3);
	hash("c1 hash ", c4);
    }
   
   private static void hash(String prefix, Car c) {
	   System.out.println(prefix + ":" + System.identityHashCode(c));;
   }
}
