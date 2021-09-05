package homework;

public class Ex04 {
	public static void main(String[] args) {
		  int[] digits = {5, 1 , 9 ,11 , 20 , 19 , 17, 21 , 30};
		  int max = 0;
		  for(int i=0; i < digits.length;i++) {
			  if(!examm(digits[i]) && digits[i]>max) {
				max=digits[i];  
			  }
		  }
		  System.out.println("max odd : " + max);
	   }
	  
	    public static boolean examm (int n) {
	    	return n%2==0;
	    }
}
