package released.version;

public interface Mother {
	void adn();
	
	default void playSport() {
		System.out.println("Mother >> badminton ...");
	}
	
	static void drinkBeer(int quantity) {
		System.out.println("Mother drinks " + quantity + " bottle");
	}
}
