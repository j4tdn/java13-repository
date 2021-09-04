package structure;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		//if
		boolean expresion = true;
		boolean expresion1 = false ;
		if (expresion) {
			System.out.println("statment");
		}
		
		System.out.println("==============");
		
		//if  else
		if (expresion) {
			System.out.println("statment1");
		}else {
			System.out.println("statment2");
		}
		//if if if
		if (expresion) {
			if (expresion1) {
				System.out.println("if in if");
			}
		}
		//if else if else if
		int weekday = 4; // Monday[2] - Sunday[8]
		  if (weekday == 2) {
		   System.out.println("Monday");
		  } else if (weekday == 3) {
		   System.out.println("Tuesday");
		  } else if (weekday == 4) {
		   System.out.println("Wednesday");
		  } else if (weekday == 5) {
		   System.out.println("Thursday");
		  } else if (weekday == 6) {
		   System.out.println("Friday");
		  } else if (weekday == 7) {
		   System.out.println("Saturday");
		  } else if (weekday == 8) {
		   System.out.println("Sunday");
		  } else {
			  System.out.println("Wrong weekend !!!");
		  }
		  //number is odd or even
		  Scanner ip = new Scanner(System.in);
		  System.out.println("Enter is number:");
		  int nbr = ip.nextInt();
		  
		  if (nbr %2 == 0) {
			  System.out.println(nbr + "number is ODD");
		  }else {
			  System.out.println( "number is EVEN");
		  }	  
}
}
