package ex04;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Person> nhansu= new ArrayList<>();
		int choice;
		do {
			System.out.println("Quan ly nhan su");
			System.out.println("1.Them nhan su");
			System.out.println("2.Hien thi thong tin nhan su");
			System.out.println("3.Hien thi luong");
			System.out.println("4.Exit");
			System.out.print("Lua chon:");
			choice=ex01.Main.inputInt();
			switch(choice) {
				case 1:
					manage.addPerson(nhansu);
					break;
				case 2:
					manage.printList(nhansu);
					break;
				case 3:
					manage.printSalary(nhansu);
					break;
			}
		}while(choice!=4);
	}
}
