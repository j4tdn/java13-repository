package homework;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner (System.in);
		Random rd = new Random();
		System.out.print("Enter row M: ");
		int M=ip.nextInt();
		System.out.print("Enter col N: ");
		int N = ip.nextInt();
		int [][] A = new int [M][N];
			
		for(int i=0; i<M; i++) {
			for(int j=0; j<N;j++) {
				 // System.out.print("A[" + i + "," + j + "] = ");
		         //   A[i][j] = ip.nextInt();
				A[i][j]=1 + rd.nextInt(99);
			}
		}
			
		for(int i=0; i<M; i++) {
			for(int j=0; j<N;j++) {
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
			
			int row=0;
			int minRow=0, maxCol=0;
			for(int i=0; i<M; i++) {
				minRow = A[i][0];
				for(int j=0; j<N;j++) {
					if(A[i][j]<minRow) {
						minRow=A[i][j];
						row=j;
					}
				}
				maxCol=A[0][row];
				for(int j=0; j<M;j++) {
					if(A[j][row]>maxCol) {
					    maxCol=A[j][row];
				    }
				}
				if(maxCol==minRow) {
					System.out.println(minRow + " is saddle element");
					return;
				}
			}
			System.out.println("not saddle element");
			
		}
}

