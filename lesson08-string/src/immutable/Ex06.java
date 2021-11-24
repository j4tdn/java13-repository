package immutable;

public class Ex06 {
	// thao tác với splip theo space+,compa&space,text&number
	public static void main(String[] args) {
		String greeting = "Cheers out of my home";
		String line = "John Smith, 18, 17T2, 15/08/2002";
		String hobbies = "Game    ---   Tennis - Badminton";
		String text = "a567c87ghvg2435hg76xyz";
		
		String [] words = greeting.split("\\s");
		String [] properties = line.split(",\\s");
		String [] games = hobbies.split("[\\s-]+");
		String [] digits = text.split("[a-z]+");
		
		
		show(words);
		System.out.println("======");
		show(properties);
		show(games);
		show(digits);
		
	}
		private static void show(String [] elememts) {
			for( String element : elememts) {
				if(!element.isEmpty()) {
					System.out.println(element);
				}
			}
	
	}
}
  