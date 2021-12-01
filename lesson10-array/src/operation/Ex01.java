package operation;

import java.util.Arrays;

public class Ex01 {
public static void main(String[] args) {
	int[] numbers = {1,9,5,36,12,33};
	
	/*Strategy oddStrategy=new Strategy() {
	@Override
	public boolean execute(int number) {
		return number%2!=0;
	}};*/
	//int sumOfOddElms=sum(numbers,oddStrategy);
//	int sumOfOddElms=sum(numbers,number -> number % 2!= 0);
//	System.out.println("sumOfOddElms: "+sumOfOddElms);
//	
//	Tuple minMaxTuple=getMaxMin(numbers);
//	System.out.println("tuple: "+ minMaxTuple.toString());
//	
	System.out.println(Arrays.toString(numbers));
	int[] newAddedArray=add(numbers,3,18);
	System.out.println(Arrays.toString(newAddedArray));
	int[] newRemoveArray=remove(numbers,3);
	System.out.println(Arrays.toString(newRemoveArray));
	int[] newDeleteArray=delete(numbers,3);
	System.out.println(Arrays.toString(newDeleteArray));
}
private static int[] delete(int[] origin, int k) {
	if(k<0||k>origin.length) {
		throw new IllegalArgumentException(k+"is out of range(0,"+(origin.length)+")");
	}
	int[] result = Arrays.copyOfRange(origin, 0, origin.length);
	for(int i =k;i<result.length-1;i++) {
		result[i]=origin[i+1];
	}	
	return Arrays.copyOfRange(result, 0, result.length-1);
}

private static int[] remove(int[] origin, int k) {
	if(k<0||k>origin.length) {
		throw new IllegalArgumentException(k+"is out of range(0,"+(origin.length)+")");
	}
	int[] result = new int[origin.length -1];
	for(int i=0; i<k;i++) {
		result[i]=origin[i];}
	for(int i =k+1;i<origin.length;i++) {
		result[i-1]=origin[i];
	}	
	return result;
}

private static int[] add(int[] origin, int index, int newElement) {
	int[] result = new int[origin.length +1];
	for(int i=0; i<origin.length;i++) {
		result[i]=origin[i];}
	for(int i =result.length-1;i> index;i--) {
		result[i]=result[i-1];
	}	
	result[index]=newElement;
	
	return result;
}


private static Tuple getMaxMin(int[] numbers) {
	int max=Integer.MIN_VALUE;
	int min=Integer.MAX_VALUE;
	for(int number :numbers) {
		if(max<number) {
			max=number;
		}
		if(min>number) {
			min=number;
		}
	}
	return new Tuple(max,min);
}




private static int sum(int[] numbers,Strategy strategy) {
	int sum=0;
	for(int number : numbers) {
		if(strategy.execute(number)) {
			sum+=number;
		}
	}
	return sum;
}
}
