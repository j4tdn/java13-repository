package io;

import java.util.Random;

public class OfMy {
	public static void main(String[] args) {
		PlayOrNot();
	}
	
	public static void PlayOrNot() {
		
		Random random = new Random();
		
		boolean decision = random.nextBoolean();
		
		if(decision) {
			System.out.println("Play");
		} else {
			System.out.println("Do not play");
		}
	}
	
	public static void FullTime() {
		
		Random random = new Random();	
		
		int team1 = random.nextInt(6);
		int team2 = random.nextInt(6);		
		System.out.println("Full time: " + team1 + " - " + team2);
	}
}
