package exercise01;

import java.util.Scanner;

public class Vehicle {
	private String name;
	private String model;
	private int capacity;
	private double price;
	
	public Vehicle() {
		
	}
	public Vehicle(String name, String model, int capacity, double price) {
		this.name = name;
		this.model = model;
		this.capacity = capacity;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return name + "		" + model + "		" + capacity + "		" + price;
	}
	
	public double tax() {
		if(capacity < 100) return price*0.01;
		else if (capacity <= 200) return price*0.03;
		return price*0.05;
	}
	public void createVehicle() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap ten chu xe: ");
		this.name = input.nextLine();
		System.out.print("Nhap loai xe: ");
		this.model = input.nextLine();
		System.out.print("Nhap dung tich xe: ");
		this.capacity = Integer.parseInt(input.nextLine());
		System.out.print("Nhap gia xe: ");
		price = Double.parseDouble(input.nextLine());
	}
}
