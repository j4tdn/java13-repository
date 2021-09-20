package view;

import java.util.Random;
import java.util.Scanner;

/**
 * Tim phan tu yen ngua
 * 		phan tu min tren hang va max tren cot
 * @author ADMIN
 *
 */
public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so hang cua bang A m = ");
		int m = sc.nextInt();
		System.out.println("nhap so cot cua bang A n = ");
		int n = sc.nextInt();
		int a[][] = new int [m][n];
		Random rd =new Random();
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
						//1+rd.nextInt(98);
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		
		//tim mang b gom cac phan tu min cua tung hang
		int b[] = new int[m];
		for(int i=0;i<m;i++) {
			int tam = a[i][0];
			for(int j=1;j<n;j++) {
				if (tam>a[i][j]) {
					tam=a[i][j];
				}
			}
			b[i]=tam;
		}
		
		
		//tim mang b gom cac phan tu max cua tung cot
		int c[] = new int[n];
		for(int j=0;j<n;j++) {
			int tam = a[0][j];
			for(int i=1;i<n;i++) {
				if (tam<a[i][j]) {
					tam=a[i][j];
				}
			}
			c[j] =tam;
		}
		
//		for(int i=0;i<m;i++) {
//			System.out.print(b[i]+"  ");
//		}
//		
//		System.out.println();
//		
//		for(int j=0;j<n;j++) {
//			System.out.print(c[j]+"  ");
//		}
		
		int dem=0;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(b[i]==c[j]) {
					System.out.println(a[i][j] +" la phan tu yen ngua ");
					System.out.println("tai phan tu A["+i+"]["+j+"]");
					dem++;
				}
			}
		}
		if(dem==0) {
			System.out.println("mang ko co phan tu yen ngua");
		}
	}
}
