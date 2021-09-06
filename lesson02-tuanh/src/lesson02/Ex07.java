package lesson02;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] array = new int[5];
		array[0] = 0;
		for (int i = 0; i<5; i++ )
		{
			int rgn = 20 + rd.nextInt(31-20);
			if(array[i] != rgn) 
			{ 
				array[i] = rgn;
				System.out.print(array[i] + " ");
			}
		}
}
}
