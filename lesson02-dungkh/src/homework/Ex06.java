package homework;

public class Ex06 {
	public static void main(String[] args) {
	      int n = 0;
	     
	      while(true) {
	    	  findPr(n);
	      }
  }
  public static boolean isPrime(int n) {
      if (n <= 1) {
          return false;
      }
      for (int i = 2; i <= Math.sqrt(n); i++) {
          if (n % i == 0) {
              return false;
          }
      }
      return true;
  }
 
  private static void findPr(int n) {
	  int k = 0;
	  while(true) {
		  if(isPrime(n)) {
			  k++;
		  }
		  if(k == 200) {
			  System.out.println("nbr 200 : " + n);
			  break;
		  }
		  n++;
	  }
  }
}
