package ex01;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		ArrayList<Vehicle> vehicleList=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int amount=0,choice;
		do {
			System.out.println("1.Input vehicle information");
			System.out.println("2.Display tax detail");
			System.out.println("3.Exit");
			choice=Validation.checkInputInt(1,3);
			switch(choice) {
				case 1:
					System.out.print("Amount of vehicle added:");
				    int n=Validation.checkInputInt();
				    for (int i=0;i<n;i++) {
				    	System.out.print("Input vehicle["+(amount+i)+"]'s owner's name:");
				    	String name=sc.nextLine();
				    	System.out.print("Input vehicle["+(amount+i)+"]'s model:");
				    	String model=sc.nextLine();
				    	System.out.print("Input vehicle["+(amount+i)+"]'s capacity:");
				    	int capacity=Validation.checkInputInt();
				    	System.out.print("Input vehicle["+(amount+i)+"]'s price:");
				    	int price=Validation.checkInputInt();
				    	System.out.println("##########################################################");
				    	Vehicle vehicle = new Vehicle(name,model,capacity,price);
				    	vehicleList.add(vehicle);
				    }
				    amount+=n;
				    break;
				case 2:
					System.out.println(String.format("%-25s%-15s%-10s%-15s%-15s","Name","Model","Capacity","Price","Tax"));
					for (Vehicle vehicle:vehicleList) {
						System.out.println(vehicle.toString());
					}
					break;
				default:
					break;
			}
		}while(choice!=3);
	}
}
