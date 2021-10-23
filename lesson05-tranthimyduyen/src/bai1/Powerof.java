package bai1;

/**
 * Bài làm tốt
 * Nhớ format code nghe em: 14đ
 */
public class Powerof {
public static void main(String[] args) {
	System.out.println(isPowerOf(2,8)); 
}
	
	public static boolean isPowerOf(int a,int b){
		int m = 0,k=0;
		if(a>b) { m=b;k=a;}else {m=a;k=b;}
		double lognm= Math.log(k)/Math.log(m);
		int lognmi = (int) (Math.floor(lognm));
		// short version
		return lognm-lognmi==0;
	 }
}
