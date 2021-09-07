package TrungHoHomeWork;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Please enter min random value: ");
		int min = Integer.parseInt(ip.nextLine());
		
		System.out.println("Please enter max random value: ");
		int max = Integer.parseInt(ip.nextLine());
		
		System.out.println("Please enter amount of random value you want: ");
		int numberOfElement = Integer.parseInt(ip.nextLine());
		
		System.out.println("Random result: " + randomExhaustedInteger(min, max, numberOfElement));
	}
	
	public static ArrayList<Integer> randomExhaustedInteger(int min, int max, int numberOfElement) {		
		while(numberOfElement > (max - min + 1)) {
			System.out.println("Please re-enter the number of value, it should be equal or less than: " + (max - min + 1));
			Scanner ip = new Scanner(System.in);
			numberOfElement = Integer.parseInt(ip.nextLine());
		}
		
		ArrayList<Integer> randomResult = new ArrayList<>();
		Random rd = new Random();
		
		while (randomResult.size() < numberOfElement) {
			int random = rd.nextInt((max-min) + 1) + min;
			
			if(!randomResult.contains(random)) {
				randomResult.add(random);
			}
		}
		
		return randomResult;
	}
}
