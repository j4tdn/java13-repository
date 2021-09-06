package lesson02;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println( " Nhap so can kiem tra");
	int n = Integer.parseInt(sc.nextLine());
	if(isPowerOfTwo(n)) {
		System.out.println(n + " la luy thua cua 2");
	}else {
		System.out.println(n + " khong phai la luy thua cua 2");
	}
	
}
public static boolean isPowerOfTwo(int n){
	double logn2 = Math.log(n)/Math.log(2);
	int logn2i = (int) (Math.floor(logn2));
	if(logn2-logn2i==0)
		return true;
	else
	return false;
 } }

	
 
	

