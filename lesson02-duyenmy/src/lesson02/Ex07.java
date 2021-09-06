package lesson02;

import java.util.Random;

public class Ex07 {
   public static void main(String[] args) {
		
		Random rd = new Random();
		
		int[] array = new int[5];
		array[0] = 20 + rd.nextInt(30 - 20 + 1);
		for(int i=1;i<5;i++) {
			array[i] = 20 + rd.nextInt(30 - 20 + 1);
			int k=0;
			do {
				k=0;
				for(int j=0;j<i;j++) {
					if(array[i]==array[j]) {
						k++;
					}
				}
				if(k!=0) {
					array[i] = 20 + rd.nextInt(30 - 20 + 1);
				}
			}while(k!=0);

		}
		System.out.println(5+ " numbers: ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + "  ");
		}
	}
}
