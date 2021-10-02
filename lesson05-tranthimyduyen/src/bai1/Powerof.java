package bai1;

public class Powerof {
public static void main(String[] args) {
	System.out.println(isPowerOf(8,2)); 
}
	
	public static boolean isPowerOf(int a,int b){
		int m = 0,k=0;
		if(a>b) { m=b;k=a;}else {m=a;k=b;}
		double lognm= Math.log(k)/Math.log(m);
		int lognmi = (int) (Math.floor(lognm));
		if(lognm-lognmi==0)
			return true;
		else
		return false;
		
	 }
}
