package immutable;

public class Ex06 {
	public static void main(String[] args) {
		String greeting = "cheers out of my home";
		String line = "john Smith, 18, 17T2, 15/08/2002";
		String hobbies = "game   -  - tenis - babminton";
		String text = "asd2131234bh1g2314212h123";
		
		String[] words = greeting.split("\\s");
		String[] properties = line.split(",\\s");
		String[] game = hobbies.split("[\\s-]+");
		String[] digits = text.split("[a-z]+");
		
		
		showText(words);
		System.out.println("====");
		showText(properties);
		System.out.println("====");
		showText(game);
		System.out.println("====");
		showText(digits);
	}
	
	private static void showText (String[] elements) {
		for (String element : elements){
			System.out.println(element);
		}
	}
}
