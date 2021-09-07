package exercises;

public class Ex06 {
	public static void main(String[] args) {
		System.out.print("So nguyen to thu 200 la: ");
		
		int count = 1;
		int i = 1;
		while(count != 200) {
			i += 2;
			if(isPrime(i)) {
				count ++;
			}
			
		}
		
		System.out.println(i);
	}
	
	public static boolean isPrime(int number) {
		if(number < 2) {
			return false;
		}
		if(number % 2 == 0 && number != 2) {
			return false;
		}
		for(int i = 3; i <= Math.sqrt(number); i += 2) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
}
