package immutable;

public class Ex06 {
	public static void main(String[] args) {
		String greeting = "cheers out of my home";
		String line ="Jonh Smith, 18, 17T2, 15/08/2021";
		String hobbies = "Game -- Tenis   Badminton---football";
		String text = "a256cjbjdb552dcmk5dc";
		
		String[] words = greeting.split("\\s");
		String [] properties = line.split(",\\s");
		String[] games = hobbies.split("[\\s-]+");
		String[] digits = text.split("[a-z]+");
		
		showText(words);
		showText(properties);
		showText(games);
		showText(digits);
	}
	
	private static void showText(String[] words) {
		for(String word :words) {
			System.out.println(word);
		}
	}
}
