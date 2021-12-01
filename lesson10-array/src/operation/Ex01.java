package operation;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = {1,9,5,36,12,33};
		
		int sumOfOddElms = sum(numbers, number -> number %2 != 0);
		System.out.println("sumOddElms: " +sumOfOddElms);
		//Strategy oddStrategy = new Strategy()
		//{
			//@Override
		//	public boolean execute(int number) {
			//	return number % 2 !=0;
			//}
	//	};
		
		Tuple minMaxTuple = getMaxMin(numbers);
		System.out.println("tuple: " + minMaxTuple);
		remove(numbers, 3);
		
	}
	//3. Add element at index k
	
	// 2. Find maximum, minimum in the loop
	private static Tuple getMaxMin(int[] numbers) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for( int number:numbers ) {
			if(max < number) {
				max = number;
			}
			if(min > number) {
				min = number;
			}
		}
		return new Tuple(max,min);
		
	}
	
	
	// 1. calculate sum of odd numbers
	private static int sum(int[] numbers, Strategy strategy) {
		int sum = 0;
		for(int number : numbers) {
			if(strategy.execute(number)) {
				sum += number;
			}
		}
		return sum;
	}
	  private static int[] remove(int[] arr, int k){
	        int [] result = new int[arr.length];
	       for(int j=0;j< k;j++) {
	    	   result[j] = arr[j];
	       }
	        for (int i = k; i < arr.length -1; i++) {
	            result[i] = arr[i+1];
	        }
	       show(result);
	        return result;
	        }
	    private static void  show(int ... arr){
	        for (int i = 0; i < arr.length - 1 ; i++) {
	            System.out.print(arr[i] +" ");
	        }
	    }

}
