package model;

import java.util.ArrayList;

import bean.Card;
import bean.Player;
import utils.Printable;

public class PlayerData {
	private PlayerData() {
	}
	
	public static Player[] getAll() {
		return new Player[] {
			new Player("Nguyen", new ArrayList<Card>()),	
			new Player("Viet", new ArrayList<Card>()),	
			new Player("Thien", new ArrayList<Card>()),	
			new Player("Bao", new ArrayList<Card>()),	
		};
	}
	
	public static void print(Player[] players) {
		for (Player player : players) {
			System.out.println("Player " + player.getName());
			Printable.print(player.getCards());
			System.out.println();
		}
	}
}
