package released.version;

public class Child implements Father, Mother{
	@Override
	public void adn() {
		System.out.println("Father >> Child >> adn >> abc123");
		
	}
	
	@Override
	public void playSport() {
		System.out.println("Child >> football, volleyball");
	}
}
