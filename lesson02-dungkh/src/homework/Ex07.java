package homework;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
	      Random random = new Random();
	      int k = 0;
	      int nb = 0;
	      while(true) {
	    	  if(k==5) {
	    		  break;
	    	  }
		      int nbr = 20 + random.nextInt(11);//[20,30]
		      if(nb!=nbr ) {
		       nb=nbr;
		       k++;
		      System.out.println( nb);
		      } 
	      }
  }
}
