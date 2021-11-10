package immutable;

public class Ex06 {
	// thao tac voi split theo space+, compa&space, text&number
	public static void main(String[] args) {
		
		//single Thread >> Thread-main
		System.out.println("Thread: " + Thread.currentThread().getName());
		
		String greeting = "cheers out of my home";
		String line = "John Smith, 18, 17T2, 15/08/2002";
		String hobbies = "Game - Tennis - Badminton";
		String text = "jhg6373gddv8737hsgdv5656dggd";
		
		String[] words = greeting.split("\\s");
		String[] properties = line.split(",\\s");
		String[] games = hobbies.split("[\\s-]+");
		String[] digits = text.split("[a-z]+");
		
		showText(words);
		System.out.println("================");
		showText(properties);
		System.out.println("================");
		showText(games);
		System.out.println("================");
		showText(digits);
	}
	
	private static void showText(String[] elements) {
		for (String element: elements) {
			if(!element.isEmpty()) {
				System.out.println(element);
			}
		}
	}
}
