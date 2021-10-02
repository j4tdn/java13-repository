package ex03;

import java.util.Scanner;
public class App {
  public static void main(String[] args) {
	  int[] a = {2, 3, 4};
	  System.out.println(getLeastCommonMultiple(a));
  }
  
  private static int getLeastCommonMultiple(int... a) {
	  int lcm = getLeastCommonMultipleOfTwoNumber(a[0], a[1]);	  
	  
      for(int i = 2; i < a.length; i++){
          lcm = getLeastCommonMultipleOfTwoNumber(a[i], lcm);    
      }
	  
	  return lcm;
  }
  
  private static int getLeastCommonMultipleOfTwoNumber(int a, int b) {
	  int lcm;
	  lcm = (a > b) ? a : b;
	    while(true) {
	      if( lcm % a == 0 && lcm % b == 0 ) {
	        break;
	      }
	      ++lcm;
	    }
	   return lcm;
  }
}
