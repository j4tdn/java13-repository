package homework;

public class Ex01 {
	 public static void main(String[] args) {
	        printTriangle(4);
	    }

	    private static void printTriangle(int n) {
	        int number = 2 * n - 1;
	        int temp1 = 2;
	        int temp2 = n;

	        for (int i = 1; i <= number; i++) {
	            if (i <= n) {
	                for (int j = 1; j <= i; j++) {
	                    System.out.print(j + " ");
	                }
	                for (int j = 1; j <= number - 2 * i; j++) {
	                    System.out.print("  ");
	                }
	                for (int j = i; j > 0; j--) {
	                    if (j == n) {
	                        continue;
	                    }
	                    System.out.print(number - j + 1 + " ");
	                }
	                System.out.println();
	            } else {
	                for (int j = 1; j <= i - temp1; j++) {
	                    System.out.print(j + " ");
	                }
	                temp1 += 2;
	                for (int j = 1; j <= i - temp2; j++) {
	                    System.out.print("  ");
	                }
	                temp2--;
	                for (int j = i; j <= number; j++) {
	                    System.out.print(j + " ");
	                }
	                System.out.println();
	            }
	        }
	    }

}
