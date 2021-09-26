package ex02;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n: ");
		int n= sc.nextInt();
		Random rd = new Random();
		int[] a= new int[n];
		//int[] kq= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=rd.nextInt(100);
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		System.out.println("==========================================");
		
		int[] kq= new int[n]; int j=0;//chua cac phan tu chia het cho 5
		int[] c= new int[n]; int k=0;//chua cac phan tu chia het cho 7
		int[] d= new int[n]; int h=0;//chua cac phan tu chia het cho 5va 7
		int[] e= new int[n]; int r=0;//chua cac phan tu ko chia het cho 5 or 7
		for(int i=0;i<n;i++) {
			if(check5(a[i])) {
				if(check7(a[i])) {
					d[h]=a[i];
					h++;
				} 
				else {
					kq[j]=a[i];
					j++;
				}
			}
			else {
				if(check7(a[i])) {
					c[k]=a[i];
					k++;
				}
				else {
					e[r]=a[i];
					r++;
				}
			}
		}
		int tam =r/2;
		int tam2 = h/2;
		j--;
		for(int i=0; i<tam-tam2; i++) {
			j++;
			kq[j]=e[i];
		}
		for(int i=0; i<h; i++) {
			j++;
			kq[j]=d[i];
		}
		for(int i=tam-tam2; i<r; i++) {
			j++;
			kq[j]=e[i];
		}
		for(int i=0; i<k; i++) {
			j++;
			kq[j]=c[i];
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+"  ");
		}
		System.out.println();
		for(int i=0;i<d.length;i++) {
			System.out.print(d[i]+"  ");
		}
		System.out.println();
		for(int i=0;i<e.length;i++) {
			System.out.print(e[i]+"  ");
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.print(kq[i]+"  ");
		}
		System.out.println();
		
	}

	public static boolean check7(int x) {
		if(x % 7 ==0) return true;
		return false;
	}
	public static boolean check5(int x) {
		if(x % 5 ==0) return true;
		return false;
	}
}
