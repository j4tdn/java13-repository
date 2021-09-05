package homework;

public class Ex02 {
	public static void main(String[] args) {
		int a = 4;
		int b = 7;
		int c = 12;
		int d = 18;
		long S = factorial(a) + factorial(b) + factorial(c) + factorial(d);
	    System.out.println("S = 4! + 7! + 12! + 18! = " + S);
	
	}
	private static long factorial (int n) {
		long fac = 1;
        for(int i = 1; i <= n;i++) {
        	fac*=i;
        }
        return fac;
      }
}
