package immutable;

public class Ex06 {
	//thao tác với split theo space+, compa&spcae, text&number
	
	public static void main(String[] args) {
		String greeting = "cheer    out of my home"; 
		String line = "John Smith, 18, 17T2, 20/02/2003";
		String hobbies = "Game  - -    Tennis  -  Badminton-----Soccer";
		String txt = "a567dasd3124462cascnhf943v032";
		
		String[]  words = greeting.split("\\s+");
		String[] properties = line.split(",\\s");
		String[] games = hobbies.split("[\\s-]+");
		String[] digits = txt.split("[a-z]+");
		
		showText(words);
		System.out.println("=============");
		showText(properties);
		System.out.println("=============");
		showText(games);
		System.out.println("=============");
		showText(digits);
	
	}
	
	private static void showText(String[] elements) {
		for(String element : elements) {
			System.out.println(element);
		}
	}
}
