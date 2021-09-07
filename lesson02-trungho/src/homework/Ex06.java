package homework;

public class Ex06 {
	/**
	 * <b>Description:</b> Enter the index/position of prime number (from small to large) ---> Return the prime number at that index<br>
	 */
	public static void main(String[] args) {
		getPrimeNmberAtAnIndex(200);
	}
	
	/**
	 * <b>Description:</b> This function to return the prime number at an index (from small to large)<br>
	 * <b>Return:</b> The prime number at an index<br>
	 * @param index represent the input index of the prime number to get value
	 */
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
	
	/**
	 * <b>Description:</b> This function to check if a number is prime number or not<br>
	 * <b>Return:</b> True if the entered number is prime number, otherwise, return False<br>
	 * @param n represent the input value
	 */
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
