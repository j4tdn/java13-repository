package ex03;

public class Ex03 {
	public static void main(String[] args) {
		int [] a = {2,3,5};
		System.out.println("the least CommonMultiple : "+ getLeastCommonMultiple(a));
	}
	private static int gcd(int a, int b) {
		while(a!= b){
            if(a>b) a= a-b;
            else b= b-a;
        }
        return (a);
	}
	private static int  BCNN(int a, int b) {
		return a*b/gcd(a, b);
	}
	private static int getLeastCommonMultiple(int [] a) {
		int ans = BCNN(a[0], a[1]);
		for(int i = 2; i < a.length; i++) {
			ans = BCNN(ans, a[i]);
		}
		return ans;
	}
	
}
