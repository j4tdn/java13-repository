package ex04;
import java.util.ArrayList;
import java.util.Scanner;
public class manage {
	
	private static Scanner sc = new Scanner(System.in);
	public static void addPerson(ArrayList<Person> People) {
		int choice;
		do {
			System.out.println("Them vao nhan su");
			System.out.println("1.Nhan vien");
			System.out.println("2.Truong phong");
			System.out.println("3.Giam doc");
			System.out.println("4.Exit");
			System.out.print("Lua chon:");
			choice=ex01.Main.inputInt();
			if (choice>=1&&choice<=3) {
				System.out.print("Nhap ten:");
				String name=sc.nextLine();
				System.out.print("Nhap ngay sinh");
				String birthday=sc.nextLine();
				System.out.print("Nhap he so luong:");
				Double hsluong=Double.parseDouble(sc.nextLine());
				switch(choice) {
					case 1:
						System.out.print("Nhap ten don vi:");
						String tendonvi=sc.nextLine();
						Nhanvien nhanvien= new Nhanvien(name,birthday,hsluong,tendonvi);
						People.add(nhanvien);
						break;
					case 2:
						System.out.print("Nhap so luong nhan vien quan ly:");
						int soluongnv=ex01.Main.inputInt();
						Truongphong truongphong = new Truongphong(name,birthday,hsluong,soluongnv);
						People.add(truongphong);
						break;
					case 3:
						System.out.println("Nhap he so chuc vu");
						Double hesochucvu=Double.parseDouble(sc.nextLine());
						giamdoc Giamdoc= new giamdoc(name,birthday,hsluong,hesochucvu);
						People.add(Giamdoc);
						break;
					default:
						break;
				}
			}
		}while(choice>=1&&choice<=3);
	}
	public static void printList(ArrayList<Person> People) {
		System.out.println("Giam doc");
		System.out.println(String.format("%-15s%-15s%-15s%-15s","Ten","Ngay sinh","He so luong","He so chuc vu" ));
		for (Person person:People) {
			if (person instanceof giamdoc) {
				giamdoc Giamdoc = (giamdoc) person;
				System.out.println(Giamdoc.toString());
			}
		}
		System.out.println("Truong phong");
		System.out.println(String.format("%-15s%-15s%-15s%-20s","Ten","Ngay sinh","He so luong","So luong nhan vien" ));
		for (Person person:People) {
			if (person instanceof Truongphong) {
				Truongphong truongphong = (Truongphong) person;
				System.out.println(truongphong.toString());
			}
		}
		System.out.println("Nhan vien");
		System.out.println(String.format("%-15s%-15s%-15s%-25s","Ten","Ngay sinh","He so luong","Ten don vi" ));
		for (Person person:People) {
			if (person instanceof Nhanvien) {
				Nhanvien nhanvien=(Nhanvien) person;
				System.out.println(nhanvien.toString());
			}
		}
	}
	public static void printSalary(ArrayList<Person> People) {
		System.out.println(String.format("%-15s%-15s%-15s", "Ten","Chuc vu", "Luong"));
		for (Person person:People) {
			if(person instanceof giamdoc) {
				giamdoc Giamdoc=(giamdoc) person;
				System.out.println(String.format("%-15s%-15s%-15.2f",Giamdoc.getName(),"Giam doc",Giamdoc.getSalary()));
			}
			if(person instanceof Truongphong) {
				Truongphong truongphong = (Truongphong) person;
				System.out.println(String.format("%-15s%-15s%-15.2f",truongphong.getName(),"Truong phong",truongphong.getSalary()));
			}
			if(person instanceof Nhanvien) {
				Nhanvien nhanvien = (Nhanvien) person;
				System.out.println(String.format("%-15s%-15s%-15.2f",nhanvien.getName(),"Nhan vien",nhanvien.getSalary()));
			}
		}
	}
}
