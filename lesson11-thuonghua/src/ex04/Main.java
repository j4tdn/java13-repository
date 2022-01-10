package ex04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		List<Dictionary> dictionaries = getData();
		Scanner ip = new Scanner(System.in);
		do {
			System.out.println("Input your option: ");
			System.out.println("1. Add word");
			System.out.println("2. Look up dictionary");
			int input = ip.nextInt();

			switch (input) {

			case 1:
				DictionaryUtils.addWord(dictionaries);
				break;

			case 2:
				DictionaryUtils.getWord(dictionaries);
				break;
			}
		} while (true);
	}

	private static List<Dictionary> getData() {
		List<Dictionary> dictionaries = new ArrayList<>();
		dictionaries.add(new Dictionary("Red", "Đỏ", "Danh từ", "màu đỏ"));
		dictionaries.add(new Dictionary("Blue", "Xanh", "Danh từ", "màu xanh"));
		dictionaries.add(new Dictionary("Pink", "Hồng", "Danh từ", "màu hồng"));
		dictionaries.add(new Dictionary("Yellow", "Vàng", "Danh từ", "màu vàng"));

		return dictionaries;
	}
}
