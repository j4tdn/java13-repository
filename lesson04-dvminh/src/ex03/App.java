package ex03;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("nhap n: ");
		int n = ip.nextInt();
		int[][] array = new int[n+1][n+1];

		for(int i = 0;i <= n;i++)
	    {
	        for(int j = 0; j <= i; j++)
	        {
	            if(i == j || j == 0)
	            {
	                array[i][j] = 1;
	                System.out.print(" " + array[i][j]);
	            }
	            else
	            {
	                array[i][j] = array[i-1][j-1] + array[i-1][j];
	                System.out.print(" " + array[i][j]);
	            }
	        }
			System.out.println();	
		}
	}
}
