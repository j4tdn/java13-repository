package ex02;

import java.util.ArrayList;
import java.util.Arrays;

public class ex02 {
	public static void main(String[] args) {
		
		System.out.println("Thong tin ve CD");
		ArrayList<CD> CDs = new ArrayList<>();
		CD cd1 = new CD(1, "Nhac Tre", "Son Tung", 12, 99.8);
		CDs.add(cd1);
		CD cd2 = new CD(2, "Tinh ca", "Dan Truong", 8, 55.0);
		CDs.add(cd2);
		CD cd3 = new CD(3, "Ho ", "Cam Ly", 10, 45.5);
		CDs.add(cd3);
		printCD(CDs);
         System.out.println("================");
		// Add  CD
		System.out.println("\n");
		CD cd4 = new CD(4, "Rock", "Siu black", 11, 3.5);
		addCD(CDs, cd4);
		System.out.println("================");

		// So luong CD
		System.out.println("So luong dia CD: " + CDs.size());
		System.out.println("================");
		// Tong gia
		System.out.println("\n Tong gia tien cua tat ca CD: "+ getAllPrice(CDs));
	}


	private static void printCD(ArrayList<CD> CDs) {
		for (CD CD : CDs) {
			System.out.println(CD);
		}
	}

	private static void addCD(ArrayList<CD> CDs, CD cd) {
		int i=0;
		for (CD CD : CDs) {
			if (CD.getId() == cd.getId()) {
				i++;
				System.out.println("ID nay da ton tai, Hay nhap id khac!!!!");
			}
		}
		if(i==0) {
		CDs.add(cd);}
		System.out.println("Danh sach CD sau khi them: ");
		printCD(CDs);
	}

	private static double getAllPrice(ArrayList<CD> CDs) {
		double total = 0d;
		for (CD CD : CDs) {
			total += CD.getPrice();
		}
		return total;
	}
}
