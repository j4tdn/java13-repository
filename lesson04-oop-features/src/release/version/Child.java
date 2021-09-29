package release.version;

public class Child implements Father, Mother{
	@Override
	public void adn() {
		System.out.println("Father>>Child>>adn>>abc123");
	}
	
	@Override
	public void playSport() {
		Mother.super.playSport();
		Father.super.playSport();
		System.out.println("Playing game ....");
	}
}
