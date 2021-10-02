package released.version;

public class Child implements Father, Mother {

	@Override
	public void adn() {
		System.out.println("Father>>Child>>adn>>>abc123");
		
	}
	// Khi kế thừa từ Father và Mother đều có chung hàm playSport() thì:
	// Cần Override lại để biết sử dụng của ai (Interface => OK, Class => CANNOT)
	
	@Override
	public void playSport() {
		Father.super.playSport(); // kế thừa bố
		Mother.super.playSport(); // kế thừa mẹ
		System.out.println("Playing game ..."); // sở thích cá nhân
	}
	
}
