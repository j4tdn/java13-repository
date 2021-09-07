package exercises;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		int i = 0;
		
		while(i != 5) {
			Random rd = new Random();
			
			numbers[i] = 20 + rd.nextInt(30 - 20 + 1);
			
			// Duyệt với các phần tử trước
			
			int j = i - 1;  
			while(j >= 0) {
				
				// Trùng thì random lại
				
				if(numbers[i] == numbers[j] ) {
					numbers[i] = 20 + rd.nextInt(30 - 20 + 1);
					j = i - 1;
					continue;
				}
				j--;
			}
			i++;
		}
		
		for(int index = 0; index < 5; index++) {
			System.out.print(numbers[index] + " ");
		}
	}
}
