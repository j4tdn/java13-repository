package released.version;

public interface Mother {
	void adn();
	
	default void playSport() {
		System.out.println("Mother >> badminton...");
	}
	
	static void drinBeer(int qty) {
		System.out.println("Mother drinks" + qty + "bottles");
	}
}
