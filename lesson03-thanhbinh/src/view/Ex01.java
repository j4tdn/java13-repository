package view;

import java.util.Scanner;

import bean.Vehicle;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int No, N = 0;
		Vehicle [] v = null;
		
		do {
			
			System.out.println("1. nhap thong tin va tao N doi tuong xe");
			System.out.println("2. Xuat ban ke khai thue truoc ba");
			System.out.println("3. Thoat ");
			System.out.println("Moi chon chuc nang");
			No = Integer.parseInt(ip.nextLine());
			switch(No) {
				case 1: {
					
					System.out.print("Nhap so luong xe");
					N =  Integer.parseInt(ip.nextLine());
//					System.out.println(N);
					v = new Vehicle[N];
					
					for (int i = 0; i< N; i++) {
						v[i] = new Vehicle();
						System.out.println("nhap thong tin xe thu "+ (i+1) + ": ");
						System.out.print("Ho va ten: "); 
						v[i].setNamecar(ip.nextLine()) ;
						System.out.print("Loai xe: ");
						v[i].setModelcar(ip.nextLine());
						System.out.print("Dung tich: ");
						v[i].setCapacity(Integer.parseInt(ip.nextLine()));
						System.out.print("Gia: ");
						v[i].setPrice(Float.parseFloat(ip.nextLine()));
					}
					break;
				}
				case 2: {
					System.out.println(String.format("%-30s %-20s %-10s %-20s %-10s","Name","Model","Capacity","Price","Tax"));
					System.out.println(String.format("%-90s","==========================================================================================="));
					for(int i =0; i < N; i++) {
						System.out.println(v[i].toString());
					}
					System.out.println(String.format("%-90s","==========================================================================================="));
					break;
				}
				default : break;
			}
			
		}while(No != 3);
		return;
	}	
}

