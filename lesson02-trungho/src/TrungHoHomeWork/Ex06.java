package TrungHoHomeWork;

public class Ex06 {
	public static void main(String[] args) {
		getPrimeNmberAtAnIndex(200);
	}
	
	public static long getPrimeNmberAtAnIndex(int index) {	
		if(index <= 0) {
			System.out.println("Index is not valid. Please try another value!");
			return -1;
		}
		
		int count = 0;
		long primeNmber = 0;
		
		for(long n = 2; n > 0; n++) {
			if (isPrimeNumber(n)) {
				primeNmber = n;
				count++;
				
				if(count == index) {
					break;
				}
			}
		}
	
		System.out.println("The Prime Number at index " + index + " is: " + primeNmber);
		return primeNmber;
	}
	
    public static boolean isPrimeNumber(long n) {
        if (n < 2) {
            return false;
        }
        
        for (int i = 2; i < (n - 1); i++){
            if (n % i == 0){
                return false;
            }   
        }
        return true;
    }
}
