package structure;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		
		//Toán tử ba ngôi
		int number = 13;
		String result = (number %2 ==0) ? "EVEN" : "ODD";
		System.out.println(result);
		//type variable = <condition> ? <value1> : <value2>
		
		//number odd or even
		Random rd = new Random();
		int nbr = rd.nextInt(100);
		if ( nbr%2==0){
			System.out.println(nbr + " :EVEN");
		}else {
			System.out.println(nbr + " :ODD");
		}
		}
		

		
		
		
	}
	

