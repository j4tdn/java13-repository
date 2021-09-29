package released.version;

public class Child implements Father,Mother{

	@Override
	public void adn() {
		// TODO Auto-generated method stub
		
	}
@Override
public void playSport() {
	Mother.super.playSport();
	Father.super.playSport();
	System.out.println("Child >> play.......");
}
}
