package released.version;

public class Child implements Father, Mother {

	@Override
	public void adn() {
		System.out.println("Father >> Child >> adn >> abc124");
		
	}
	@Override
	public void playSport() {
		
		Father.super.playSport();
		System.out.println("Child >> playing game...");
	}
}
