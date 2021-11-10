package immutable;

public class Ex06 {
	// Thao tác với split theo space+, compa&space, text&number
	public static void main(String[] args) {
		String greeting = "cheers out of my home";
		String line = "John Smith, 18, 17T2, 15/08/2002";
		String hobbies = "Game -  -   Tennis - Badminton";
		String text = "a241bhc24124soZe674";
		
		String[] words = greeting.split("\\s+");
		String[] properties = line.split(", ");
		String[] games = hobbies.split("[\\s-]+");// \\s-\\s
		String[] digits = text.split("[a-zA-Z]+");
		
		
		showText(words);
		System.out.println("============");
		showText(properties);
		System.out.println("============");
		showText(games);
		System.out.println("============");
		showText(digits);
	}
	
	private static void showText(String[] elements) {
		for (String element : elements) {
			System.out.println(element);
		}
	}
}
