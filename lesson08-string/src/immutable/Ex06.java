package immutable;

public class Ex06 {
	public static void main(String[] args) {
		String greeting = "cheers   out of   my home";
		String line = "John Smith, 18, 17T2, 15/08/2002";
		String hobbies = "Game - - Tennis - Badminton";
		String text = "a567bhc8764okt012xyz";

		String[] words = greeting.split("\\s+");
		String[] properties = line.split(",\\s");
		String[] games = hobbies.split("[\\s-]+");// \\s-\\s
		String[] digits = text.split("[a-z]+");

		showText(words);
		System.out.println("===============");
		showText(properties);
		System.out.println("===============");
		showText(games);
		System.out.println("===============");
		showText(digits);

	}

	public static void showText(String[] elements) {
		for (String element : elements) {
			if (!element.isEmpty()) {
				System.out.println(element);
			}
		}
	}
}
