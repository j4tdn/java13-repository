package released.version;

public class Child implements Father, Mother{

	@Override
	public void adn() {
		System.out.println("Father >> Child >> ADN >> abc123");
		
	}
	
	@Override
	public void playSport() {
		Father.super.playSport();
		Mother.super.playSport();
		System.out.println("Playing game ...");
	}

}
