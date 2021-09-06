package homework;

public class Ex05 {
	public static void main(String[] args) {
		decimalToBinary(5);
	}
	public static void decimalToBinary(int a) {
		int S=0;
		int i=7;
		while(i>=0) {
			if(a>=Math.pow(2, i)) {
				S=S*10+1;
				a=(int) (a-Math.pow(2,i));
			}
			else S*=10;
			i--;
		}
		System.out.println("Binary: "+S);
	}
}
