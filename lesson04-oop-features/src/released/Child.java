package released;

public class Child implements Father{

	@Override
	public void adn() {
		System.out.println("Father>> Child>>adn>>abc123");
       		
	}
	@Override
	public void playSport() {
		System.out.println(" Child>> Football, Voleyball");
   		
	}

}
