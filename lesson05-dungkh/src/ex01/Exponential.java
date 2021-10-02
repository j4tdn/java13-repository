package ex01;

public class Exponential {
	public static void main(String[] args) {
		System.out.println("(8,2) " + isPowerOf(8, 2));
		System.out.println("(2,8) " + isPowerOf(2, 8));
		System.out.println("(20,4) " + isPowerOf(20, 4));
		System.out.println("(64,4) " + isPowerOf(64, 4));
		System.out.println("(56,2) " + isPowerOf(1, 2));
	}
	
	private static boolean isPowerOf(double a, double b) {
		if(a==0) {
			return false;
		}
		if(a==1) {
			return true;
		}
		 while(true) {
             if((a%b)!= 0){
                 return false;   
                 }
               a = a/b;
              if(a == 1) {
                 return true;
                 }
        }
	}

}
