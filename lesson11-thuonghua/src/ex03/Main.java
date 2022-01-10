package ex03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

	

		List<String> num = List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A");
		List<String> type = List.of("CO", "RO", "CHUON", "BICH");

		List<Cards> card = Utils.createCard(num, type);
		Utils.shuffle(card);

	}
}
