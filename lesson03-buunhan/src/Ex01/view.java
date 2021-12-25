package Ex01;
import java.util.Scanner;

public class view {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		Vehicle[] vehicles = null;
		do {
			System.out.println("1. Import car info.");
			System.out.println("2. Show car Tax ");
			System.out.println("3. Exit");
			System.out.print("Choose an option : ");
			n = Integer.parseInt(sc.nextLine());
			switch(n) {
			case 1:{
				System.out.print("Nhap so luong xe: ");
				int N = Integer.parseInt(sc.nextLine());
				vehicles = new Vehicle[N];
				for(int i=0; i<N; i++) {
					vehicles[i] = new Vehicle();
					System.out.println("Import "+(i+1)+" :");
					vehicles[i].createVehicle();
				}
				break;
			}
			case 2:{
				System.out.printf(" %-20s  %-20s  %-20s  %-22s  %-23s\n","Ten Chu Xe","Loai xe","Dung tich","Gia","Thue");
				System.out.println("===============================================================================================================");
				for(Vehicle vehicle:vehicles) {
					System.out.printf(" %-20s  %-20s  %-20d  %-20.2f  %-18.5f\n ",vehicle.getName(),vehicle.getModel(),vehicle.getCapacity(),vehicle.getPrice(),vehicle.tax());
				}
				break;
		}
			case 3:{
				System.out.println("Bye!!!");
				break;
			}
			
			default: break;
			
	}
}while(true);}
}
