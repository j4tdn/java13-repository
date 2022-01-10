package view;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import bean.Word;

public class Ex04 {
	public static void main(String[] args) {
		System.out.println("Tra từ điển!");
		System.out.println("1. Thêm từ vựng");
		System.out.println("2. Tra từ");
		System.out.println("3. Thoát");
		
		Scanner ip = new Scanner(System.in);
		Map<String, Word> words = new HashMap<>();
		int n = 0;
		while(n < 3) {
			n = Integer.parseInt(ip.nextLine());
			switch (n) {
			case 1:
				System.out.println("Nhập tự cần thêm");
				System.out.println("Nhập từ");
				String w = ip.nextLine();
				System.out.println("Nhập nghĩa");
				String m = ip.nextLine();
				System.out.println("Nhập loại từ");
				String wT = ip.nextLine();
				System.out.println("Nhập chú thích");
				String note = ip.nextLine();
							
				words.put(w, new Word(w, m, wT, note));
				break;
			case 2:
				System.out.println("Nhập từ cần tìm kiếm");
				String word = ip.nextLine();
				Set<Entry<String, Word>> entries = words.entrySet();
				System.out.println("từ cần tìm:" + words.get(word));
				break;
			}
		}
	}
}
