package ex04;

import java.util.Scanner;
import java.util.Vector;

public class Ex04 {
	public static void main(String[] args) {
		int n1=0, n2=0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào số thứ nhất: ");
		n1 = scanner.nextInt();
		System.out.println("Nhập vào số thứ hai: ");
		n2 = scanner.nextInt();
		System.out.print(n1+" = ");
		Vector<Integer> uoc1 =Uoc(n1);
		System.out.println(" ");
		System.out.print(n2+" = ");
		Vector<Integer> uoc2 =Uoc(n2);
		System.out.println(" ");
if(uoc1.size()>uoc2.size()) {
		for (int k = 0; k < uoc1.size(); k++) { 
            if(uoc1.get(k)==uoc1.get(k+1)) {
            	uoc1.remove(k);
            }else{continue;}}
}else {
	if(uoc2.size()>uoc1.size()) {
		for (int k = 0; k < uoc2.size(); k++) { 
            if(uoc2.get(k)==uoc2.get(k+1)) {
            	uoc2.remove(k);
            }else{continue;}}
}
}
		Check(uoc1, uoc2);
	}

	public static Vector<Integer> Uoc(int n) {
		int dem;
		Vector<Integer> uoc = new Vector<Integer>();

		for (int i = 2; i <= n; i++) {
			dem = 0;
			while (n % i == 0) {
				++dem;
				n /= i;
				uoc.add(i);
			}
			if (dem != 0) {
				if (dem > 1) {
					System.out.print(i + "(" + dem + ")");
				} else
					System.out.print(i);
				if (n > i) {
					System.out.print(" * ");
				}
			}
		}
		return uoc;
	}
	public static void Check(Vector<Integer> uoc1, Vector<Integer> uoc2) {
		if(uoc1.size()!=uoc2.size()) {
			System.out.println("hahaha Hai số đã nhập không tương đương!!!");
		}else {
		for (int i = 0; i < uoc1.size(); i++) {
			if(uoc1.get(i)==uoc2.get(i)) {
				if(i==(uoc1.size()-1)) {
					System.out.println("Hai số đã nhập là hai số tương đương!!!");
				}else{continue;}}else{
			System.out.println("hihihi Hai số đã nhập không tương đương!!!");
			}
			
		} }
	}
	
}
