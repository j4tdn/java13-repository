package ex04;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		int[] input = {3,15,21,0,15,17,21};
		
		ArrayList<Integer> output = getUniqueNumbers(input);
		
		for(Integer x : output) {
			System.out.print(x + " ");
		}
	}
	
	public static ArrayList<Integer> getUniqueNumbers(int input[]) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		int count = 0;
		int number = 0;
		for(int i = 0;i<input.length;i++) {
			number = input[i];
			count = 0 ;
			for(int j = 0;j<input.length;j++) {
				if (number == input[j]) {
					count++;
				}
			}
			if(count == 1)  output.add(number);
		}
		
		return output;
	}
}
