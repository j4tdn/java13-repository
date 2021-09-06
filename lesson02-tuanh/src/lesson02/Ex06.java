package lesson02;

public class Ex06 {
	public static void main(String[] args) {
		int n = 2;
		prime200(n);
	}
	
	private static boolean prime(int n) 
	{
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	private static void prime200(int n) {
		int count = 0;
		do
		{
			if(prime(n)==true) {
				count++;
			}
			if(count == 200) {
				System.out.println(n);
				break;
			}
			n++;
		}while(true);
	}
}
