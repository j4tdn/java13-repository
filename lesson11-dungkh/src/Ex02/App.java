package Ex02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class App {
	  static Scanner sc = new Scanner(System.in);
	  private static void nhapCD(CD cd) {
		  System.out.println("Enter ID of CD: ");
		  cd.setMaCD(sc.nextInt());
		  sc.nextLine();
		  System.out.print("Enter name of CD : ");
	      cd.setTypeCD(sc.nextLine());
	      System.out.print("Enter Singer name : ");
	      cd.setSinger(sc.nextLine());
	      System.out.print("Enter number of songs : ");
	      cd.setSingNumbers(sc.nextInt());
	      System.out.print("Enter price: ");
	      cd.setPrice(sc.nextFloat());
	  }

	public static void main(String[] args) {
		CD[] cds = null;
		int input,n = 0;
		boolean flag = true;
		do {
			System.out.println("What's your Choice ?");
			 System.out.println("===========MENU=============");
		        System.out.println("1. Add a CD into list");
		        System.out.println("2. Number of CDs");
		        System.out.println("3. total price of CD list");
		        System.out.println("4. Sort in descending of price");
		        System.out.println("5. Sort in ascending of type");
		        System.out.println("0. Quit");
	            input = sc.nextInt();
	            switch (input) {
				case 1: {
					System.out.println("Nhap so luong CD : ");
					n = sc.nextInt();
					cds = new CD[n];
					for (int i = 0; i < n; i++) {
                        System.out.println("CD thứ " + (i + 1)+": ");
                        cds[i] = new CD();
                        nhapCD(cds[i]);
                    }
                    break;
				}
				case 2:
					List<CD> cdAll = new ArrayList<>();
					for(CD cd : cds) {	
						cdAll.add(cd);
					}
					printf(cdAll);
                    break;
				case 3:
					 System.out.println("Tổng số lượng CD là : " + n);
	                 break;
				case 4:
					int sum = 0;
					for (int i = 0; i < n; i++) {
						sum += cds[i].getPrice();
					}
					 System.out.println("Tổng giá thành là : " + sum);
	                    break;
				case 5:
					List<CD> sortPrice = new ArrayList<>();
					for(CD cd : cds) {	
						sortPrice.add(cd);
					}
					sortPrice.sort(Comparator.comparing(CD::getPrice,Comparator.reverseOrder()));
					printf(sortPrice);
					break;
				case 6:
					List<CD> sortName = new ArrayList<>();
					for(CD cd : cds) {	
						sortName.add(cd);
					}
					sortName.sort(Comparator.comparing(CD::getTypeCD));
					printf(sortName);
					break;
						
				default:
					 	System.out.println("End");
	                    flag = false;
	                    break;
				}
		}while(flag);
		
	}
	private static <E> void printf(List<E> elements) {
		for(E element: elements) {
			System.out.println(element + " ");
		}
	}
	
	
}