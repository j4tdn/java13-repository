package lesson02;

public class Ex06 {
	 public static void main(String[] args) {
	        
         
	        int dem = 0; // đếm số số nguyên tố
	        int i = 2;   // tìm số nguyên tố bắt dầu từ số 2
	        while (dem < 200) {
	            if (isPrimeNumber(i)) {
	               
	                dem++;
	            }
	            i++;
	        }
	        System.out.print(i + " ");
	    }
	  
	   
	     
	    public static boolean isPrimeNumber(int n) {
	        // so nguyen n < 2 khong phai la so nguyen to
	        if (n < 2) {
	            return false;
	        }
	        // check so nguyen to khi n >= 2
	        int squareRoot = (int) Math.sqrt(n);
	        for (int i = 2; i <= squareRoot; i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
}
