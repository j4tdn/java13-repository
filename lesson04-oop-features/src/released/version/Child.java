package released.version;

public class Child implements Father, Mother{

	@Override
	public void adn() {
		System.out.println("Child >> adn ");
	}
	
	@Override
	public void playSport() {
		System.out.println("Child >> football, volleyball");
	}
}
